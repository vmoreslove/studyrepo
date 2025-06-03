package com.example;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea();


        Circle circle = new Circle();
        circle.getArea();

        Shape[] myArray = new Shape[3];
        myArray[0] = circle;
        myArray[1] = rectangle;
        myArray[2] = circle;

        for (int i = 0; i < 3; i++) {

            if (myArray[i] instanceof Circle) {
                //System.out.println("circle " + i);
                ((Circle) myArray[i]).imCircle();
            }
            else if(myArray[i] instanceof Rectangle){
                //System.out.println("rectangle " + i);
                ((Rectangle) myArray[i]).imRectangle();
            }
        }

    }
}
