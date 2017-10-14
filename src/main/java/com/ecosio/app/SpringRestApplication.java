package com.ecosio.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Run in Tomcat
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

///**
// * Run as standalone Java app
// */
//@SpringBootApplication
//@ComponentScan("com.ecosio")
//public class SpringRestApplication {
//
//  public static void main(String[] args) throws Exception {
//    SpringApplication.run(SpringRestApplication.class, args);
//  }
//
//}