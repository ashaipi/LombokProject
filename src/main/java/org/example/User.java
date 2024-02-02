package org.example;

public class User {
    private final double PI;
    private int id;
    private String name;

    public User(double PI, int id, String name) {
        this.PI = PI;
        this.id = id;
        this.name = name;
    }

    public double getPI() {
        return PI;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
