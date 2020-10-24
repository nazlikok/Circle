package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Write a Raduis of Circle:");

        float radius = myObj.nextFloat();  // Read user input
        System.out.println("Raduis of Circle = " + radius);

        Circle circle = new Circle();
        circle.Calculate(radius);

    }
}
