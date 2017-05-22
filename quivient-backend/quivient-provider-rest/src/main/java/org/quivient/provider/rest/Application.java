package org.quivient.provider.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import org.quivient.business.configuration.SpringBusinessConfig;

/**
 * Application : Class de l'application avec les propriete
 * spring.
 */
@SpringBootApplication
@ComponentScan({ "org.quivient.provider.rest" })
@Import({ SpringBusinessConfig.class})
@PropertySource(value = { "file:C:/Users/W1NN1/Desktop/Socle/properties/quivient.properties" })
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
