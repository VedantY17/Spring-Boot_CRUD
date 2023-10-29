package com.jsp.springboot1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

	List<VendorExtension> vendorExtensions = new ArrayList<VendorExtension>();
	Contact contact = new Contact("Neeraj", "https://vashijspiders.com", "neeraj@mail.com");

	ApiInfo apiInfo = new ApiInfo("User Management System", "API's to perform all actions related to User crud in App",
			"Snapshoot-0.0.1", "https://j&qspidersvashi.com/", contact, "www.jspqspvashi.com", "trainingand placement",
			vendorExtensions);

	@Bean
	public Docket myDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.jsp.springboot1")).build().apiInfo(apiInfo);
	}

}
