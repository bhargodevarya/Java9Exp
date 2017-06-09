package com.bhargo.web.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Index")
public class Index {

    @RequestMapping("/isup")
    public String isUp() {
        return "I am up and running";
    }
}
