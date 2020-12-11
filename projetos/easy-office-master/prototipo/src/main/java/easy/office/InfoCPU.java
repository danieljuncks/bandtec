package easy.office;

import Log.CriarLog;
import conexao.ConnectionFactory;
import java.io.IOException;
import telegram.SendMessage_1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.TickType;
import oshi.hardware.HardwareAbstractionLayer;

public class InfoCPU {

    SystemInfo si = new SystemInfo();
    HardwareAbstractionLayer hal = si.getHardware();
    CentralProcessor cpu = hal.getProcessor();

    //Pegando Info da CPU 
    public String nome = cpu.getProcessorIdentifier().getName();

    //Pegandp % de uso da CPU 
    long[] oldTicks = new long[TickType.values().length];

    double getPorc() {

        double d = (cpu.getSystemCpuLoadBetweenTicks(oldTicks) * 100);
        oldTicks = cpu.getSystemCpuLoadTicks();
        return d;
    }
    
     public Double getMediaFrequencia() {
        Long soma = 0L;
        for (Long freq : cpu.getCurrentFreq()) {
            soma += freq;
        }
        return soma / cpu.getLogicalProcessorCount() / Math.pow(10, 9);
    }

    public void adiciona() throws IOException {
        CriarLog cl = new CriarLog();
        Connection connection = null;
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (ClassNotFoundException ex) {
            cl.registrarLog(ex.toString());
        }
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "INSERT INTO CPU_COMPUTADOR values (?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, 11);
            stmt.setString(2, nome);
            stmt.setDouble(3, this.getPorc());
            stmt.setInt(4, 1);
            stmt.execute();
            stmt.close();
            cl.registrarLog("Os dados da CPU foram adicionados");
        } catch (SQLException e) {
            cl.registrarLog(e.toString());
            throw new RuntimeException(e);
        }
    }

    public void telegram(int sla) throws IOException {
        if (sla < 70) {
            SendMessage_1 a = new SendMessage_1();
            a.send("Uso de CPU: " + sla + "%");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        InfoCPU t1 = new InfoCPU();
        //t1.adiciona();
        System.out.println(t1.getMediaFrequencia()  + "GHz");
                
    }

}
