package com.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* Projeto Spring Boot gerado via Spring Initializer
* Os seguintes modulos foram selecionados:
* - Spring Data JPA
* - Spring Web
* - H2 Database
* - OpenFeign
* E foram adicionados as dependencias os seguintes modulos:
* - Springdoc OpenAPI UI
* - Spring Cloud Starter Openfeign
*
* @author NeyHiwerson
* creditos a Falvojr - Tech Lead, Dio.me
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
	}

}
