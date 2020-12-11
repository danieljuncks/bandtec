package com.danieljuncks.projetoclientrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoClientRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoClientRestApplication.class, args);
	}

}
