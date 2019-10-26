
package com.study.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ldt merry
 * @date 2019/10/23
 */
@EnableEurekaServer
@SpringBootApplication
public class StudyEurekaApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(StudyEurekaApplication.class, args);
	}
}
