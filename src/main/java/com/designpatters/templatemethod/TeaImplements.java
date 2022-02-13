package com.designpatters.templatemethod;

public class TeaImplements extends OrderAbstract {

    public TeaImplements (){
        System.out.println("Create Tea");
    }

    @Override
    public Order getOrder() {
        return new TeaImplements();
    }

    @Override
    public void heatWater() {
        System.out.println("Heating Water");
    }

    @Override
    public void mixer() {
        System.out.println("Mixing Tea");
    }

    @Override
    public void putInCup() {
        System.out.println("Putting Tea in a cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add Tea");
    }

}
