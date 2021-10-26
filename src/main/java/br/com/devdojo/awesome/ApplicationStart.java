package br.com.devdojo.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//mesmo que @Configuration @EnableAutoConfigurations e @ComponentScan
public class ApplicationStart {
	public static void main(String[] args) {
		SpringApplication.run (ApplicationStart.class, args);

	}

}

