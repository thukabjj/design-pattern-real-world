package com.designpatters.templatemethod;


public class CoffeeShop {

    public static void main(String[] args) {
        Order tea = new TeaImplements();
        Order coffee = new CoffeeImplements();
        tea.prepare();
        coffee.prepare();
    }
}
