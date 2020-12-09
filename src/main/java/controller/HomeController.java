package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping(value="/add/first/{first}/second/{second}")
    public String home(@PathVariable("first") int firstNumber, @PathVariable("second") int secondNumber) {
        return ((Integer)(firstNumber + secondNumber)).toString();
    }
}
