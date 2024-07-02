package dev.tinhxpear.todo_app_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TodoAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApiApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				WebMvcConfigurer.super.addCorsMappings(registry);
				registry.addMapping("/**")
						.allowedMethods("*")
						.allowedOrigins("http://localhost:5173");
			}
		};
	}
}
