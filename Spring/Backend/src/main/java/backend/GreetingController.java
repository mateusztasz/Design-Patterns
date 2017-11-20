package backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Mateusz on 02.10.2017.
 */
@RestController
public class GreetingController {

    private static final String hello = "Hello, ";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), hello + name);
    }

    @RequestMapping("/word")
    public String word() {
        return "Dzień dobry";
    }
}