package com.example;

class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public void getArea() {
        System.out.println(width * height);
    }
}
