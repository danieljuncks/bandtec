package br.com.bandtec.projeto.jdbc;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProgramaLeitura {

    public static void main(String[] args) {
        
        // objeto que contém os dados da conexão:
        // onde está o banco? Qual o Driver?
        // quais o login e senha?
        DadosConexao dadosConexao = new DadosConexao();

        // o "jdbcTemplate" é como se fosse o 
        // canal de comunicação com o banco
        JdbcTemplate jdbcTemplate
                = new JdbcTemplate(dadosConexao.getDataSource());

        // SELECT (o List abaixo é do java.util)
        List leituras = jdbcTemplate.queryForList(
                "select * from leitura");
        System.out.println("Todos: " + leituras);

        List soCpu = jdbcTemplate.queryForList(
                "select * from leitura where origem = ?",
                "cpu");
        System.out.println("Só CPU: " + soCpu);

        List soCpuAltoValor = jdbcTemplate.queryForList(
                "select * from leitura where  "
                + "  origem = ? and valor >= ?",
                "cpu", 80);
        System.out.println("Só CPU e alvo valor: "
                + soCpuAltoValor);

        List soDiscoPassado = jdbcTemplate.queryForList(
                "select * from leitura where "
                + "  origem = ? and data_hora < ? ",
                "disco", LocalDateTime.now());
        // o LocalDateTime precisa ser importado!
        System.out.println("Disco antes de agora: "
                + soDiscoPassado);

        // Insert
        jdbcTemplate.update(
                "insert into leitura (origem, valor, data_hora) "
                + " values (?,?,?)",
                "Rede", 11, LocalDateTime.now());
        // depois faça um select no console do h2 
        // para confirmar se foi inserido

        // Update
        jdbcTemplate.update(
                "update leitura set valor = ? where origem = ?",
                5, "memoria");
        // depois faça um select no console do h2 
        // para confirmar se as linhas foram alteradas

        // Delete
        jdbcTemplate.update(
                "delete from leitura where id = ?", 2);
        // depois faça um select no console do h2 
        // para confirmar se foi excluido

        /* Crie um código que:
            a) insira 3 registros para a origem 'CPU'
            b) o valor devem ser aleatório entre 0 e 100
            c) o data_hora deve ser sempre a data e hora atual
         */
        Random sorteador = new Random();
        for (int r = 0; r < 30; r++) {
            int valor = sorteador.nextInt(101);

            String sql = "insert into leitura "
                    + "(origem, valor, data_hora) "
                    + "values (?,?,?)";

            jdbcTemplate.update(
                    sql, "CPU", valor, LocalDateTime.now());
        }

    }

}
