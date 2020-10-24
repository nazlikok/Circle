package com.company;

public class Circle {
    int circleX;
    int circleY;
    float radius;

    float calculateArea(){
        float area = (float) (Math.PI*radius*radius);
        return area;
    }

    float calculateCircumference(){
        float circum = (float) (2*Math.PI*radius);
        return circum;
    }
    boolean isInside(int point_x, int point_y) {
        return (point_x - circleX) * (point_x - circleX) + (point_y - circleY) * (point_y - circleY) <= radius * radius;

    }
}
