package com.designpatters.templatemethod;
public interface Order {
    void heatWater();
    void mixer();
    void putInCup();
    void addCondiments();
    Order getOrder();
    void prepare();
}
