package org.spring.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //view 이동
@RequestMapping("/api")
public class MainRequestController {

    @GetMapping("/get1")
    public String get1() {
        return "get1";
    }
    @GetMapping("/path1/{userId}")
    public String path1(@PathVariable String userId) {
        return "userId";
    }
    @GetMapping("/path2/{userId}")
    public String path2(@PathVariable("userId") String uId) {
        return "uId";
    }
}
