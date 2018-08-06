package com.teradata.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * zuul不仅可以作为路由转发，还可以作为权限验证
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class CloudDockerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDockerZuulApplication.class, args);
    }
}
