package com.company;

public class Circle {
    int circle_x;
    int circle_y;

    void calculateArea(float radius){
        float area;
        area = (float) (Math.PI*radius*radius);
        System.out.println("Area = " + area);
    }

    void calculateCircumference(float radius){
        float circum;
        circum = (float) (2*Math.PI*radius);
        System.out.println("Circumference = " + circum);
    }
    void isInside(int point_x, int point_y, float radius, int circle_x, int circle_y) {
        if ((point_x - circle_x) * (point_x - circle_x) + (point_y - circle_y) * (point_y - circle_y) <= radius * radius){
            System.out.println("point is inside the circle");
        }
        else{
            System.out.println("point is not inside the circle");
        }
    }
}
