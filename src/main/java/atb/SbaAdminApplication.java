package atb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SbaAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaAdminApplication.class, args);
	}
	
}
