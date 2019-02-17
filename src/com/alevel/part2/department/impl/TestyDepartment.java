package com.alevel.part2.department.impl;

import com.alevel.part2.menu.Dish;
import com.alevel.part2.menu.MenuComponents;
import com.alevel.part2.menu.MenuPoint;
import com.alevel.part2.cooker.Cooker;
import com.alevel.part2.department.Department;

public class TestyDepartment extends Department {

    public TestyDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Taras", new String[]{"пирожене", "крем"}),
                new Cooker("Petro", new String[]{"фрукты"}),
        };
    }

    @Override
    public Dish cook(MenuPoint menuPoint) {
        Dish dish = new Dish();
        for (String component : MenuComponents.getComponents(menuPoint)) {
            try {
                dish.add(getDishComponent(component));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return dish;
    }
}
