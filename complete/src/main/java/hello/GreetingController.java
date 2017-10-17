package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/favorite")
    public Favorite favorite(@RequestParam("name") String name
            , @RequestParam("food") String favfood) {
        return new Favorite(name,favfood);
    }

    @RequestMapping("/add")
    public Integer sum(@RequestParam("first") Integer number,
                       @RequestParam("second") Integer number2) {
        return number+number2;
    }
}
