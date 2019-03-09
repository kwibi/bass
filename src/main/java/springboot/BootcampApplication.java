package springboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"md.bass.internship.bootcamp.controllers","md.bass.internship.bootcamp.services"})
@SpringBootApplication(scanBasePackages={"md.bass.internship"})
@EnableJpaRepositories("md.bass.internship")
@EntityScan("md.bass.internship.bootcamp.entities")
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

}
