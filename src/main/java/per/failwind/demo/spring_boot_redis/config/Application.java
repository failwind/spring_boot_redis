package per.failwind.demo.spring_boot_redis.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

//@Configuration
@SpringBootApplication
//public class Application extends SpringBootServletInitializer {
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
