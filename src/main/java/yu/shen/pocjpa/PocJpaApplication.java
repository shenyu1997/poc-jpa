package yu.shen.pocjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import yu.shen.pocjpa.configtesting.YuProperties;

@SpringBootApplication
@EnableWebMvc
@EnableConfigurationProperties(YuProperties.class)
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class PocJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocJpaApplication.class, args);
	}
}
