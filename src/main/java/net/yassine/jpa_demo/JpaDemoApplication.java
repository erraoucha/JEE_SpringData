package net.yassine.jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.yassine.jpa_demo.entities.Product;
import net.yassine.repository.ProductRepository;
@EnableJpaRepositories(basePackages = "net.yassine.repository")
@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	@Autowired 
private ProductRepository productRepository;
	public static void main(String[] args) {

		SpringApplication.run(JpaDemoApplication.class, args);
	}

@Override
public void  run(String... args) throws Exception {
	productRepository.save(new Product(null, 4500, "computer", 33));
    productRepository.save(new Product(null, 400, "ifon",4));

}

}
