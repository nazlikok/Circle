package com.company;
import java.util.Scanner;
import java.util.Random;

public class CircleApplication {

    public static void main(String[] args) {
        int pointX=5;
        int pointY=7;
        System.out.println("PointX="+ pointX +" PointY="+ pointY);

        Random rand = new Random();

        for(int i=0; i<6; i++){
            int randX = rand.nextInt(100);
            int randY = rand.nextInt(100);
            int randRadius = rand.nextInt(100);

            Circle testCircle = new Circle();
            testCircle.circleX=randX;
            testCircle.circleY=randY;
            testCircle.radius=randRadius;

            float area = testCircle.calculateArea();


            System.out.println("cirlceX=" + testCircle.circleX + " cirlceY=" + testCircle.circleY + " radius=" + testCircle.radius);
            System.out.println(i+"."+"circle area = " + area);

            boolean isInside = testCircle.isInside(pointX,pointY);
            if (isInside){
                System.out.println("point is inside");
            }
            else {
                System.out.println("point is not inside");
            }
        }

    }
}
