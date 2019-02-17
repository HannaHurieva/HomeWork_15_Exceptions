package com.alevel.part2.menu;

import java.util.Arrays;

public class Dish {
    private String[] data;
    private int counter;

    public Dish(String[] data) {
        this.data = data;
        this.counter = data.length;
    }

    public Dish() {
        data = new String[10];
        counter = 0;
    }

    public void add(String data) {
        if (counter == this.data.length - 1) {
            // Like ArrayList
            String[] newData = new String[this.data.length + this.data.length / 2 + 1];
            System.arraycopy(this.data,
                    0,
                    newData,
                    0,
                    data.length());
            this.data = newData;
        }
        this.data[counter++] = data;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}