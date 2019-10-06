package kz.balalar.balalartrendsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BalalarTrendsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalalarTrendsServiceApplication.class, args);
	}

}
