package com.company;

public class Person {

    private String gender = "woman";
    private int height = 170;
    private String complexion = "tall";
    private int age = 30;

    public void walk() {
        System.out.println("Natalja is walking");
    }
    public void talk() {
        System.out.println("Natalja is talking");
    }
    public void eat() {
        System.out.println("She is eating an ice cream");
    }
    public void run(boolean sportsmen) {
        if (sportsmen) {
            System.out.println("She is a sportsmen");
        } else {
            System.out.println("She is a little bit lazy");
        }
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getComplexion() {
        return this.complexion;
    }
    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
