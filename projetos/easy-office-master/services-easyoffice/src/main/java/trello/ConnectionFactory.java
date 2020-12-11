package trello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Log.CriarLog;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException, IOException {
        CriarLog cl = new CriarLog();
        String usuario = "EasyAdm";
        String senha = "#Gfgrupo2";
        String url = "jdbc:sqlserver://svreasyoffice.database.windows.net:1433;database=bdEasyOffice;"
                + "user= " + usuario + "@svreasyoffice;password=" + senha + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        try {
            cl.registrarLog("Conexao com SQL server realizada com sucesso");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            cl.registrarLog(e.toString());
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ConnectionFactory a = new ConnectionFactory();
        a.getConnection();
    }
}
