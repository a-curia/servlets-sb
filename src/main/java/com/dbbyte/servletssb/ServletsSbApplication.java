package com.dbbyte.servletssb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class ServletsSbApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ServletsSbApplication.class, args);
		
	    SpringApplication sa = new SpringApplication(ServletsSbApplication.class);
	    sa.setLogStartupInfo(false);
	    sa.run(args);		
	}
}
