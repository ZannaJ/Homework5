package com.company;

public class Main {

    public static void main(String[] args) {
//        Person natalja = new Person();
//        System.out.println("Natalja is " + natalja.getAge() + " years old" );
 //       natalja.setAge(30);
//        System.out.println("Natalja is very " + natalja.getComplexion());
//        natalja.setComplexion("tall");
//        System.out.println("Natalja is a beautiful " + natalja.getGender());
//        natalja.setGender("woman");
//        System.out.println("She is " + natalja.getHeight() + " cm height");
//        natalja.setHeight(170);

//        natalja.walk();
 //       natalja.talk();
//        natalja.eat();
//        natalja.run(false);

//        Person person = new Person();
        // set the properties of the person class.
//        person.setAge(1);
//        person.setHeight(0.5f);
//        person.setGender("Male");
//        person.setComplexion("Fair");
//
//        person.walk(false);
//        person.eat(true);
//        person.run(true);

        // Instantiate our rectangle class.
//        Rectangle rectangle = new Rectangle(5, 10);

//        Rectangle rectangle1 = new Rectangle();

//        rectangle1.setLength(12);
//        rectangle1.setBreadth(7);

        // Set the length and breadth
//        rectangle.setBreadth(5);
//        rectangle.setLength(10);

        // output the area
//        System.out.println("Area rectangle1: " + rectangle1.getArea());
//        System.out.println("Area: " + rectangle.getArea());

        // output the perimeter
//        System.out.println("Perimeter: " + rectangle.getPerimeter());
//        System.out.println("Perimeter rectangle1: " + rectangle1.getPerimeter());

        // Calculator
        Calculator calculator = new Calculator();
        int sum = calculator.addValues(2, 4, 8, 9, 10, 11, 23, 25);

//        System.out.println(sum);
//        System.out.println(calculator.addValues(22, 11, 4));
        int difference, product;
        float quotient, average;

        difference = calculator.subtractValues(60, 30);
        product = calculator.multiplyValues(3, 4, 2, 5);
        quotient = calculator.divideValues(40, 20);
        average = calculator.averageOfValues(2, 3, 8, 19, 29, 30);


        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Average: " + average);
    }
}