package com.alevel.part2.menu;

public enum MenuPoint {
    POINT1("Mяско с картохой под соусом анане"),
    POINT2("Пицца-заебицца"),
    POINT3("Паста под зуб(зубной соус)"),
    POINT4("Греческий салат(под свинцом)"),
    POINT5("Серожене пирожене"),
    POINT6("Водочная тарелка");

    private static final int MENU_INCREMENT = 1;
    private final String menuText;

    MenuPoint(String menuText) {
        this.menuText = menuText;
    }

    public String getMenuText() {
        return this.menuText;
    }

    public static String[] getMenuList() {
        MenuPoint[] values = MenuPoint.values();
        String[] menuList = new String[values.length];
        for (int i = MENU_INCREMENT; i <= values.length; i++) {
            menuList[i - MENU_INCREMENT] = "\n" + Integer.toString(i) + ": " + values[i - MENU_INCREMENT].getMenuText();
        }
        return menuList;
    }

    public static MenuPoint getPointByMenuNumber(int numberFromMenu) {
        return MenuPoint.values()[numberFromMenu - MENU_INCREMENT];
    }

    public static int getMenuSize() {
        return MenuPoint.values().length;
    }


}
