package com.company;

public class Main {

    public static void main(String[] args) {
        Person natalja = new Person();
        System.out.println("Natalja is " + natalja.getAge() + " years old" );
        natalja.setAge(30);
        System.out.println("Natalja is very " + natalja.getComplexion());
        natalja.setComplexion("tall");
        System.out.println("Natalja is a beautiful " + natalja.getGender());
        natalja.setGender("woman");
        System.out.println("She is " + natalja.getHeight() + " cm height");
        natalja.setHeight(170);

        natalja.walk();
        natalja.talk();
        natalja.eat();
        natalja.run(false);



    }
}
