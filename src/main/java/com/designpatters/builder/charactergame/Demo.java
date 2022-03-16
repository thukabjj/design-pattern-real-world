package com.designpatters.builder.charactergame;

public class Demo {
    public static void main(String[] args) {

        CharacterBuilder characterBuilder = new CharacterBuilder();
        CreateCharacter createCharacter = new CreateCharacter(characterBuilder);

        createCharacter.createHumanWarrior("Jordan");
        final Character human = characterBuilder.getResult();
        System.out.println(human.toString());

        createCharacter.createOrkRogue("Vrubakk");
        final Character ork = characterBuilder.getResult();
        System.out.println(ork.toString());

        createCharacter.createElfWizzard("Gardoggs Truehandle");
        final Character elf = characterBuilder.getResult();
        System.out.println(elf.toString());


    }
}
