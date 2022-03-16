package com.kxin.domainshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class DomainShortenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainShortenerApplication.class, args);
	}

}
