package com.designpatters.builder.charactergame;

public class CharacterBuilder implements BuilderCharacter {

    private String name;
    private int age;
    private double height;
    private double weight;
    private Genre genre;
    private Breed breed;
    private ClassCharacter classCharacter;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setGender(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public void setClassCharacter(ClassCharacter classCharacter) {
        this.classCharacter = classCharacter;
    }

    public Character getResult() {
        return new Character(name,age,height,weight,genre,breed,classCharacter);
    }
}
