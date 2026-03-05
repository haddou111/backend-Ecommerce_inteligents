package haddou.net.dakishop.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "haddou.net.dakishop")
public class DakiShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DakiShopApplication.class, args);
	}

}
