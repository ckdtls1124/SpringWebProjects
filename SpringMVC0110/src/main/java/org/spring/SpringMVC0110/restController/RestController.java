package org.spring.SpringMVC0110.restController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memberPage")
public class RestController {
    @GetMapping("/logIn")
    public String doLogIn(Model model){
        model.addAttribute("name", "Charlie");
        model.addAttribute("userid", "ckdtls1124");
        model.addAttribute("userpw", "Shin1234");
        return "memberPage/logIn";
    }
}
