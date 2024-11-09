package SB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration

//@ComponentScan(basePackages = {"com.example.SB", "SpringBootMVCPostgreSQL"})
/*
@ComponentScan(basePackages = {"com.example.SB", "com.example.SpringBootMVC", "com.example.SpringBootMVC.model"})
"com.example.SpringBootMVC", "com.example.SpringBootMVC.model"
Подключаю MVC из третьего проекта
*/
@ComponentScan(basePackages = {"com.example.SB"})

public class SBApplication {

	public static void main(String[] args) {
           SpringApplication.run(SBApplication.class, args);
                           
	}

}
