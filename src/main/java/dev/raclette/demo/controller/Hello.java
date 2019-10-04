package dev.raclette.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity sayHello() {
        return ResponseEntity.ok("Hello world");
    }
}
