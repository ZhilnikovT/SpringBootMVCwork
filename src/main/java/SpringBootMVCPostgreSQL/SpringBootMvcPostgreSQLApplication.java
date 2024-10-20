package SpringBootMVCPostgreSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.SpringBootMVCPostgreSQL.*"})
//----
@EntityScan("com.example.SpringBootMVCPostgreSQL.*")
@EnableJpaRepositories("com.example.SpringBootMVCPostgreSQL.*")
//----
public class SpringBootMvcPostgreSQLApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcPostgreSQLApplication.class, args);
	}

}
