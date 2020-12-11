package br.com.banctec.projetoagendador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration // habilita uma classe como classe de configuração do projeto
@EnableScheduling // habilita agendamentos na API. Só funciona onde tem uma @Configuration
// as 2 anotoações acima poderiam estar em qualquer classe
public class ProjetoAgendadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoAgendadorApplication.class, args);
	}

}
