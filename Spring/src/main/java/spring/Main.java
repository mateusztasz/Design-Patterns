package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class Main {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World Mateusz!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}