package com.alevel.part2.cooker;

public class Cooker {
    private final String name;

    private final String[] responsibility;

    public Cooker(String name, String[] responsibility) {
        this.name = name;
        this.responsibility = responsibility;
    }

    public String getName() {
        return name;
    }

    public String addDishComponent(String component) {
        return name + " add " + component;
    }

    public String[] getResponsibility() {
        return responsibility;
    }
}
