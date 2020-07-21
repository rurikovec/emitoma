package com.example.restworkshop.model;

public class Person {
    private String name;
    private String title;

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet() {
        return "Oh, hi there " + this.name + ", my dear " + this.title + "!";
    }
}
