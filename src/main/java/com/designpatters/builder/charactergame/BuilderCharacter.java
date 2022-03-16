package com.designpatters.builder.charactergame;

public interface BuilderCharacter {

    void setName(String name);
    void setAge(int age);
    void setHeight(double height);
    void setWeight(double weight);
    void setGender(Genre genre);
    void setBreed(Breed breed);
    void setClassCharacter(ClassCharacter classCharacter);

}
