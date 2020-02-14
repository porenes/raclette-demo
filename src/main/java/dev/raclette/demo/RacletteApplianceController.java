package dev.raclette.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RacletteApplianceController {

    @GetMapping("/moto")
    public String moto(){
        return "In Raclette We Trust 🧀";
    }

}
