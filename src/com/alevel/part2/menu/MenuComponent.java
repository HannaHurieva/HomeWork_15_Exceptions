package com.alevel.part2.menu;

import com.alevel.part2.department.Department;

public class MenuComponent {

    private MenuPoint menuPoint;

    private Department department;

    private String[] components;

    public MenuComponent(MenuPoint menuPoint, Department department, String[] components) {
        this.menuPoint = menuPoint;
        this.department = department;
        this.components = components;
    }

    public MenuPoint getMenuPoint() {
        return menuPoint;
    }

    public Department getDepartment() {
        return department;
    }

    public String[] getComponents() {
        return components;
    }
}
