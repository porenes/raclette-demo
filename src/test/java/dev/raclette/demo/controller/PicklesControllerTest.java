package dev.raclette.demo.controller;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

public class PicklesControllerTest {

    @Test
    public void getPickles() {
        PicklesController controller = new PicklesController();
        ResponseEntity r = controller.getPickles();
        assert r.getStatusCode() == HttpStatus.OK;
        assert r.getStatusCodeValue() == 200;
    }
}