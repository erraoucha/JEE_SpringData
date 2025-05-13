package net.yassine.jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.yassine.repository.ProductRepository;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaDemoApplication.class, args);
	}

}
