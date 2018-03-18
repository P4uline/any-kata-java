package fr.coderetreat.anykata.anykata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnyKataConfiguration {
	
	@Bean
	public SomeBean someBean() {
		return new SomeBean();
	}

}
