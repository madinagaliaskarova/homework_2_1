package com.company;

public class Main {

    public static void main(String[] args) {
        Son son = new Son("Sasha", 20, "Actor", "Single", HobbyEnum.FOOTBALL);
        son.getInfo();
        son.greet();
        son.greet("Privet");

        Son son1 = new Son("Maks", 25, "Builder", "Married", HobbyEnum.HUNTING);
        son1.getInfo();
        son1.greet();
        son1.greet("Hi");


        Father father = new Father("Pasha", 45, "Programmer", "Married", HobbyEnum.FISHING);
        father.getInfo();
        father.greet();
        father.greet("Hello");






    }
}
    /*public Son(String name, int age, String profession, String maritalStatus, int age1, HobbyEnum hobbyEnum) {
        super(name, age, profession, maritalStatus, age1, hobbyEnum);
    }*/