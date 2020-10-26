package com.company;
import java.util.Random;

public class CircleApplication {

    public static void main(String[] args) {
        Point point = new Point();
        point.pointX=2;
        point.pointY=2;
        System.out.println("PointX="+ point.pointX +" PointY="+ point.pointY + "\n");

        Random rand = new Random();
        for(int i=1; i<=5; i++){
            int randX = rand.nextInt(100);
            int randY = rand.nextInt(100);
            int randRadius = rand.nextInt(100);

            Circle testCircle = new Circle();
            Point circleCenter = new Point();
            circleCenter.pointX = randX;
            circleCenter.pointY = randY;
            testCircle.center = circleCenter;
            testCircle.radius=randRadius;

            float area = testCircle.calculateArea();
            float circumference = testCircle.calculateCircumference();

            System.out.println("cirlceX=" + testCircle.center.pointX + " cirlceY=" + testCircle.center.pointY + " radius=" + testCircle.radius);
            System.out.println(i+"."+"circle area = " + area);
            System.out.println(i+"."+"circle circumference = " + circumference);

            boolean isInside = testCircle.isInside(point);
            if (isInside){
                System.out.println("circleCenter is inside");
            }
            else {
                System.out.println("circleCenter is not inside");
            }
            System.out.println();
        }

    }
}
