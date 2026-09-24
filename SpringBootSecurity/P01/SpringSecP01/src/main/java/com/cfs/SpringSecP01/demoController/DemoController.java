package com.cfs.SpringSecP01.demoController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public Map<String,String> hello()
    {
        return Map.of("Message","Spring security is working");
    }

    @GetMapping("/bye")
    public String bye()
    {
        return "Nikhil Sharma";
    }
}
