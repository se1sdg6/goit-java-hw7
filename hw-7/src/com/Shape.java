package com;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name;
    }
}
