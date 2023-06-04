package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelComeController {

    @GetMapping("/welcome")
    public String greeting() {
        return "nhanviens/welcome";
    }

    @GetMapping("/login")
    public String login(){
        return "nhanviens/login";
    }
}