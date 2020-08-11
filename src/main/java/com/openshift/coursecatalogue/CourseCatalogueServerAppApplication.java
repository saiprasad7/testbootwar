package com.openshift.coursecatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CourseCatalogueServerAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseCatalogueServerAppApplication.class, args);
	}

}
