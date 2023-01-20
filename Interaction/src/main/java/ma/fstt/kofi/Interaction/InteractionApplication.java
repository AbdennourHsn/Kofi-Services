package ma.fstt.kofi.Interaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InteractionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InteractionApplication.class, args);
	}

}
