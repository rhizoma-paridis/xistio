package org.x.xi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class XistioApplication {

    public static void main(String[] args) {
        SpringApplication.run(XistioApplication.class, args);
    }

}
