package com.mycorp.product_app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycorp.product_app.ProductRepository;
import com.mycorp.product_app.entity.Product;

@Configuration
public class DetaSeeder {
	
	@Bean
	CommandLineRunner seedProducts(ProductRepository productRepository) {
		return args -> {
			long count = productRepository.count();
			if (count >= 10) {
				return;
			}
			for (int i = (int) count + 1; i <= 10; i++) {
				Product p = new Product();
				p.setName("Product" + i);
				p.setPrice(100 * i);
				productRepository.save(p);
			}
		};
	}

}
