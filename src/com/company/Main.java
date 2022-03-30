package com.company;
/*
Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс
сделать не наследуемым !!!
c)  Все поля классов должны быть приватными, одно из полей должно
быть сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum) !!!!!!!
d)  В классах не должно быть setter-ов, только getter-ы и конструкторы !!!!!!!!
e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии,
один из них сделать неперезаписываемым
f)  В классе 3-го уровня перезаписать один из методов родителя
g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA)
 и 2 объекта класса 3-го уровня (objectB, objectC),
 также распечатать все свойства объектов и вызвать
 перегруженные методы через каждый из экземпляров ваших объектов.
*/


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