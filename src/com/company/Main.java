package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Circle Testcircle = new Circle();
        Testcircle.circle_x=3;
        Testcircle.circle_y=3;
        int Point_x=5;
        int Point_y=7;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write a Raduis of Circle:");

        float radius = myObj.nextFloat();
        System.out.println("Raduis of Circle = " + radius);

        Testcircle.calculateCircumference(radius);
        Testcircle.calculateArea(radius);
        Testcircle.isInside(Point_x,Point_y,radius,Testcircle.circle_x, Testcircle.circle_y);
    }
}
