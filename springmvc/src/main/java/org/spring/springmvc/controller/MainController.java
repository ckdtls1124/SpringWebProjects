package org.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    //getMapping
/*    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {

        // /templates/ index .html
        // /templates/index.html
        return "index"; // viewndex", method = RequestMethod.GET)
    }*/

    @GetMapping("/index") //a, 주소
    public String index() {
        // /templates/ index .html
        // /templates/index.html
        return "index"; // view페이지
    }

    @PostMapping("/post1")
    public String post1(){

        return "post1";
    }


}