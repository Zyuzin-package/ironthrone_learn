package com.example.ironthrone_learn.LittleDistraction;

public class Gallows {

    private Soap soap;
    private Rope rope;

    public Gallows(Soap soap, Rope rope) {
        System.out.println("Create Gallows with args");
        this.soap = soap;
        this.rope = rope;
    }

    public Gallows() {
        System.out.println("Create Gallows without args");
    }
}
