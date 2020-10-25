

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
    boolean isInside(int pointX, int pointY) {
        return (pointX - circleX) * (pointX - circleX) + (pointY - circleY) * (pointY - circleY) <= radius * radius;

    }
}