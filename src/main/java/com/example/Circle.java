package com.example;

 class Circle extends Shape {
     public Circle(double r) {
         this.r = r;
     }

     double r;
     @Override
     public void getArea() {
         System.out.println(r * r * 3.14);
     }
}


