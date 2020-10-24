package com.company;

public class Circle {
    int circleX;
    int circleY;

    float radius;

    void calculateArea(){
        float area = (float) (Math.PI*radius*radius);
        System.out.println("Area = " + area);
    }

    void calculateCircumference(){
        float circum = (float) (2*Math.PI*radius);
        System.out.println("Circumference = " + circum);
    }
    boolean isInside(int point_x, int point_y) {
        return (point_x - circleX) * (point_x - circleX) + (point_y - circleY) * (point_y - circleY) <= radius * radius;

    }
}
