package karn.cloud.karnclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class KarnClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarnClientApplication.class, args);
	}

}
