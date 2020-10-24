package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Circle testCircle = new Circle();
        testCircle.circleX =3;
        testCircle.circleY =3;

        int pointX=5;
        int pointY=7;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write a Raduis of Circle:");

        float radius = myObj.nextFloat();
        System.out.println("Raduis of Circle = " + radius);

        testCircle.radius=radius;
        testCircle.calculateCircumference();
        testCircle.calculateArea();
        boolean isInside = testCircle.isInside(pointX,pointY);
        if (isInside){
            System.out.println("point is inside");
        }
        else {
            System.out.println("point is not inside");
        }
    }
}
