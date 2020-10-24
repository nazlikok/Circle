package com.company;

public class Circle {
    void Calculate(float radius){

        float area,circum;
        area = (float) (Math.PI*radius*radius);
        circum = (float) (2*Math.PI*radius);

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circum);
    }

}
