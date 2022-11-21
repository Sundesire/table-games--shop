package java9.tablegames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;

@SpringBootApplication
public class TableGamesShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableGamesShopApplication.class, args);
	}

}
