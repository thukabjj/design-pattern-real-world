package com.designpatters.templatemethod;

public abstract class OrderAbstract implements Order {

    public final void prepare(){
            Order order = getOrder();
            order.heatWater();
            order.mixer();
            order.putInCup();
            order.addCondiments();
        }
    }
