package com.learning.springapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HomeController {

    @RequestMapping("/")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to application");
    }

}
