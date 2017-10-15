package com.ecosio.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Sample RESTful application
 */
@SpringBootApplication
@ComponentScan("com.ecosio")
public class SpringRestApplication extends SpringBootServletInitializer {


  //Make sure that everything for .war deployment is there
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringRestApplication.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringRestApplication.class, args);
  }

}
