package com.company;

import java.io.Serializable;

public class Katze implements Serializable {
    public String name;
    public int alter;
    public String stammbaum;

    public Katze(String name, int alter, String stammbaum){
        this.name  = name;
        this.alter = alter;
        this.stammbaum = stammbaum;
    }

    @Override
    public String toString() {
        return "Miau " + this.name + ", miezmiez " + this.alter + " mau miaumio " + stammbaum;
    }
}
