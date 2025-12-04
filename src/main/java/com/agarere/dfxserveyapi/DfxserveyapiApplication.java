package com.agarere.dfxserveyapi;

import com.agarere.dfxserveyapi.entity.Question;
import com.agarere.dfxserveyapi.repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DfxserveyapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfxserveyapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDatabase(QuestionRepository repo) {
		return args -> {
			repo.save(new Question("Spring Boot nedir?"));
			repo.save(new Question("Dependency Injection ne işe yarar?"));
			repo.save(new Question("REST API nedir?"));
		};
	}
}
