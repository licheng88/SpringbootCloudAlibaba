package com.Capgemini.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/nacos")
    public String t1(){

        return "你是什么成分";
    }
}
