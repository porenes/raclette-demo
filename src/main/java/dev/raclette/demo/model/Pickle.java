package dev.raclette.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Bean;

@JsonAutoDetect
public class Pickle {

    private int size;

    public Pickle(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
