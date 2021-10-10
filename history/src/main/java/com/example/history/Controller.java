package com.example.history;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author voidsolve
 * date: 10.10.2021 23:52
 */
@RestController
public class Controller {

    @RequestMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/main")
    public String main() {
        return "You're in the main page";
    }
}
