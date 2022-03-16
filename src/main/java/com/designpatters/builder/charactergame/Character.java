package com.designpatters.builder.charactergame;

public class Character {

    private String name;
    private int age;
    private double height;
    private double weight;
    private Genre genre;
    private Breed breed;
    private ClassCharacter classCharacter;

    public Character(String name, int age, double height, double weight, Genre genre, Breed breed, ClassCharacter classCharacter) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.genre = genre;
        this.breed = breed;
        this.classCharacter = classCharacter;
    }

    @Override
    public String toString() {
        return "YOU CREATED THE CHARACTER: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", genre=" + genre +
                ", breed=" + breed +
                ", classCharacter=" + classCharacter;
    }
}
