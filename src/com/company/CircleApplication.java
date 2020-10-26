package com.company;
import java.util.Scanner;
import java.util.Random;

public class CircleApplication {

    public static void main(String[] args) {
        Point pointClass = new Point();
        pointClass.pointX=2;
        pointClass.pointY=2;
        System.out.println("PointX="+ pointClass.pointX +" PointY="+ pointClass.pointY + "\n");

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
            float circumference = testCircle.calculateCircumference();



            System.out.println("cirlceX=" + testCircle.circleX + " cirlceY=" + testCircle.circleY + " radius=" + testCircle.radius);
            System.out.println(i+"."+"circle area = " + area);
            System.out.println(i+"."+"circle circumference = " + circumference);

            boolean isInside = testCircle.isInside(pointClass.pointX,pointClass.pointY);
            if (isInside){
                System.out.println("point is inside");
            }
            else {
                System.out.println("point is not inside");
            }
            System.out.println();
        }

    }
}
