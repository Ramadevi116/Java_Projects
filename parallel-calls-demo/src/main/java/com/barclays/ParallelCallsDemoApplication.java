package com.barclays;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@EnableResourceServer
//@RestController
//public class ParallelCallsDemoApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ParallelCallsDemoApplication.class, args);
//	}
//	@RequestMapping("/validate")
//	public String helloMsg(){
//		return "Welcome to Spring boot";
//	}
//
//	@Configuration
//	protected static class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter{
//		@Override
//		@Bean
//		public void init(AuthenticationManagerBuilder auth) throws Exception {
//			auth.inMemoryAuthentication().withUser("sai-client").password("password").roles("USER");
//		}
//	}
//
//}


//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
////@EnableResourceServer
//public class ParallelCallsDemoApplication {
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(ParallelCallsDemoApplication.class, args);
//	}
//
////	@RestController
////	public static class HelloController {
////
////		@RequestMapping("/validate")
////		public String helloMsg() {
////			return "Welcome to Spring Boot";
////		}
////	}
////
////	@Configuration
////	protected static class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter {
////
////		@Override
////		public void init(AuthenticationManagerBuilder auth) throws Exception {
////			auth.inMemoryAuthentication()
////					.withUser("sai-client").password("password").roles("USER");
////		}
////	}
//
//}
