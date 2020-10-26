

package com.company;

public class Circle {
    Point center;
    float radius;

    float calculateArea(){
        float area = (float) (Math.PI*radius*radius);
        return area;
    }

    float calculateCircumference(){
        float circum = (float) (2*Math.PI*radius);
        return circum;
    }
    boolean isInside(Point point) {
        return (point.pointX - center.pointX) * (point.pointX - center.pointX) + (point.pointY - center.pointY) * (point.pointY - center.pointY) <= radius * radius;

    }
}