package com.rohan.microservices.netflizzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflizZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflizZuulApiGatewayServerApplication.class, args);
	}
	
	@Bean
	public Sampler DefaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
