package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Write a Raduis of Circle:");

        float radius = myObj.nextFloat();  // Read user input
        System.out.println("Raduis of Circle = " + radius);

        float area,circum;
        //radius=10;
        area = (float) (Math.PI*radius*radius);
        circum = (float) (2*Math.PI*radius);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circum);

    }
}
