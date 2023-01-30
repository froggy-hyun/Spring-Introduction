package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//static 보다 우선순위
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
