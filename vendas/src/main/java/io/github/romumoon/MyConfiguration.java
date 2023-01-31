package io.github.romumoon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("devlopment")
public class MyConfiguration {
	
	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de vendas";
	}
	
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("Running devlopment configurations.");
		};
	}
}
