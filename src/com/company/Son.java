package com.company;

public final class Son extends Father {
    private String address;

    public Son(String name, int age, String profession, String maritalStatus, HobbyEnum hobbyEnum) {
        super(name, age, profession, maritalStatus, hobbyEnum);
    }


    public String getAddress() {
        return address;
    }
    @Override
    public void greet() {
        System.out.println("Привет, я сын");
    }
    @Override
    public void getInfo(){
        System.out.println(getName() + " " + getAge() + " " + getProfession() + " "
                + getMaritalStatus() + " " + getHobbyEnum() + " ");
    }

}
