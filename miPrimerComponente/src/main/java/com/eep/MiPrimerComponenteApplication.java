package com.eep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.eep.*" })
public class MiPrimerComponenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerComponenteApplication.class, args);
	}

}
