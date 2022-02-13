package com.designpatters.templatemethod;


public class CoffeeImplements extends OrderAbstract {

    public CoffeeImplements(){
        System.out.println("Create Coffee");
    }

    @Override
    public Order getOrder() {
        return new CoffeeImplements();
    }

    @Override
    public void heatWater() {
        System.out.println("Heating Water");
    }

    @Override
    public void mixer() {
        System.out.println("Mixing Coffee");
    }

    @Override
    public void putInCup() {
        System.out.println("Putting Coffee in a cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add Coffee");
    }
}
