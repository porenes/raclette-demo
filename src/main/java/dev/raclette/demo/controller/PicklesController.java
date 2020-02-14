package dev.raclette.demo.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.raclette.demo.model.Pickle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pickles")
public class PicklesController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPickles(){
        Pickle pick = new Pickle(2,"sour","Dark Green");
        Pickle pick2 = new Pickle(3,"sweet","Light Green");
        List<Pickle> pickles = new ArrayList<>();
        pickles.add(pick);
        pickles.add(pick2);
        return ResponseEntity.ok(pickles);
    }
}
