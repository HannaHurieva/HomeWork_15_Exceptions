package com.alevel.part2.department.impl;

import com.alevel.part2.menu.Dish;
import com.alevel.part2.menu.MenuComponents;
import com.alevel.part2.menu.MenuPoint;
import com.alevel.part2.cooker.Cooker;
import com.alevel.part2.department.Department;

public class HotDepartment extends Department {

    public HotDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Alla", new String[]{"картошка", "тесто"}),
                new Cooker("Vasilisa", new String[]{"мясо", "соус", "начинка"}),
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
