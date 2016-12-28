package e1.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ARestController
{

    @RequestMapping("/")
    public String greetings()
    {
        return "Hello World!";
    }
}
