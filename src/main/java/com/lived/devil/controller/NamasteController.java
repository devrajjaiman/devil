package com.lived.devil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by devraj on 15/11/18.
 */
@RestController
@RequestMapping(value = "/api")
public class NamasteController {

    @GetMapping("/hello")
    public String sayIt(){
        return "Namaste";
    }
}
