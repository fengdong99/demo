package com.xuehai.scm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableEurekaServer
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class Application {

	@Autowired
	private DiscoveryClient discoveryClient;

	/**
	 * 获取所有服务
	 * http://127.0.0.1:8090/services
	 * ["consul","spring-boot-service-scm"]
	 */
	@RequestMapping("/services")
	public Object services() {
		return discoveryClient.getServices();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
