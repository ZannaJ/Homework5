package com.company;

public class Rectangle {

    // A rectangle typically has 4 sides.
    // A rectangle has opposite side equal.
    // S rectangle has a length and a breadth.
    // A rectangle has an areas and perimeter.

    // Properties/ Attributes of a rectangle/
    private int breadth;
    private int length;

    public int getBreadth(int breadth) {
        return this.breadth;
    }
    public void setBreadth() {
        this.breadth = breadth;
    }
    public int getLength(int length) {
        return this.length;
    }
    public void setLength() {
        this.length = length;
    }
    public int getArea() {
        // area of a rectangle is l * b
        return this.length * this.breadth;
    }
    public int detPerimeter() {
        return 2 * (this.length + this.breadth);
    }
}
