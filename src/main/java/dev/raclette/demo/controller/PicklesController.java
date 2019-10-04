package dev.raclette.demo.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.raclette.demo.model.Pickle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pickles")
public class PicklesController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPickles(){
        Pickle pick = new Pickle(2);
        return ResponseEntity.ok(pick);
    }
}
