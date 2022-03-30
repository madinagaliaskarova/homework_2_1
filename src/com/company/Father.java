package com.company;

public class Father extends Grandfather {
    private String profession;
    private String maritalStatus;
    private HobbyEnum hobbyEnum;

    public Father(String name, int age, String profession, String maritalStatus, HobbyEnum hobbyEnum) {
        super(name, age);
        this.profession = profession;
        this.maritalStatus = maritalStatus;
        this.hobbyEnum = hobbyEnum;
    }

    public String getProfession() {
        return profession;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }


    public HobbyEnum getHobbyEnum() {
        return hobbyEnum;
    }

    public void greet() {
        System.out.println("Привет");
    }
    final public void greet(String hello){
        System.out.println("hello");
    }

    public void getInfo(){
        System.out.println(getName() + " " + getAge() + " " + getProfession() + " "
                + getMaritalStatus() + " " + getHobbyEnum() + " ");
    }


}

