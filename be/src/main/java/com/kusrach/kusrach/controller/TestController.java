package com.kusrach.kusrach.controller;

import com.kusrach.kusrach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/")
    public String index() {
        System.out.println("qwer");
        return userRepository.findById(new Long(11)).get().toString();
    }

}
