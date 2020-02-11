package dev.raclette.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class RacletteApplianceControllerTest {

    @Test
    public void moto() {
        RacletteApplianceController controller = new RacletteApplianceController();
        assertSame(controller.moto(),"In Raclette We Trust 🧀");
    }
}