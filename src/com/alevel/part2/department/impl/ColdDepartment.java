package com.alevel.part2.department.impl;

import com.alevel.part2.menu.Dish;
import com.alevel.part2.menu.MenuComponents;
import com.alevel.part2.menu.MenuPoint;
import com.alevel.part2.cooker.Cooker;
import com.alevel.part2.department.Department;

public class ColdDepartment extends Department {

    public ColdDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Vasiliy", new String[]{"паста", "салат", "сало", "селедка", "заправка"}),
                new Cooker("Inna", new String[]{"соус", "свинец", "огурцы"}),
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
                String[] ex = { component + " not in the kitchen, sorry"};
                return new Dish(ex);
            }
        }
        return dish;
    }


}
