package ma.fstt.kofi.User;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import utils.JwtToken;



@SpringBootApplication
@EnableDiscoveryClient

public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	
	@Bean JwtToken getTokenCode() {
		return new JwtToken();
	}


}
