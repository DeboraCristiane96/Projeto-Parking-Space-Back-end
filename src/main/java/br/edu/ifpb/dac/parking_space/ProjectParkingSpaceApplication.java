package br.edu.ifpb.dac.parking_space;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@EnableWebMvc
@SpringBootApplication
public class ProjectParkingSpaceApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ProjectParkingSpaceApplication.class, args);

	}
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");
    }
}
