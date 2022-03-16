package com.designpatters.builder.charactergame;

public class CreateCharacter {

    private BuilderCharacter builder;

    public CreateCharacter(BuilderCharacter builder){
        this.builder = builder;
    }

    public void createHumanWarrior(String name) {
        this.builder.setName(name);
        this.builder.setAge(25);
        this.builder.setHeight(1.80);
        this.builder.setWeight(100);
        this.builder.setGender(Genre.MAN);
        this.builder.setBreed(Breed.HUMAN);
        this.builder.setClassCharacter(ClassCharacter.WARRIOR);
    }
    public void createElfWizzard(String name) {
        this.builder.setName(name);
        this.builder.setAge(2000);
        this.builder.setHeight(3.00);
        this.builder.setWeight(110);
        this.builder.setGender(Genre.WOMAN);
        this.builder.setBreed(Breed.ELF);
        this.builder.setClassCharacter(ClassCharacter.WIZARD);
    }

    public void createDwarfMage(String name) {
        this.builder.setName(name);
        this.builder.setAge(2000);
        this.builder.setHeight(1.20);
        this.builder.setWeight(110);
        this.builder.setGender(Genre.MAN);
        this.builder.setBreed(Breed.DWARF);
        this.builder.setClassCharacter(ClassCharacter.MAGE);
    }

    public void createOrkRogue(String name) {
        this.builder.setName(name);
        this.builder.setAge(2000);
        this.builder.setHeight(1.20);
        this.builder.setWeight(110);
        this.builder.setGender(Genre.WOMAN);
        this.builder.setBreed(Breed.ORK);
        this.builder.setClassCharacter(ClassCharacter.ROGUE);
    }

}
