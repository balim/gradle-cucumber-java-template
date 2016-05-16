package com.myproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    @RequestMapping("/start")
    public String getTitle() {
        return "hello world";
    }

}
