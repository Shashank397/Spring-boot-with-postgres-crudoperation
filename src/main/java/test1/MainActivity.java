package test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration 
@EnableJpaRepositories()
public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainActivity.class, args);
	}

}
