package atu.ie.week3_recap_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week3RecapDockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Week3RecapDockerApplication.class, args);
    }
}
