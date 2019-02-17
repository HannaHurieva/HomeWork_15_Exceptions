package com.alevel.part2;

import com.alevel.part2.menu.MenuPoint;

public class Order {

    private MenuPoint[] data;
    private int counter;

    public Order(MenuPoint[] data) {
        this.data = data;
        this.counter = data.length;
    }

    public Order() {
        data = new MenuPoint[10];
        counter = 0;
    }

    public void add(MenuPoint data) {
        if (counter == this.data.length - 1) {
            // Like ArrayList
            MenuPoint[] newData = new MenuPoint[this.data.length + this.data.length / 2 + 1];
            System.arraycopy(this.data,
                    0,
                    newData,
                    0,
                    this.data.length);
            this.data = newData;
        }
        this.data[counter++] = data;
    }

    public MenuPoint[] getOrderdata() {
        return data;
    }
}
