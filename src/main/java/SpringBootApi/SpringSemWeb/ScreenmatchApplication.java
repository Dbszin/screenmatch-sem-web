package SpringBootApi.SpringSemWeb;

import SpringBootApi.SpringSemWeb.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	private String[] args;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.args = args;
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
