/**
 * @Class: RoomPaint
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 7, 2023
 * Description: This program will calculate the gallons and quarts of paint are needed to paint the room.
 */

import java.util.Scanner;

public class RoomPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input values
        int paintCoverage = 350;

        System.out.println("Enter length:");
        int length = sc.nextInt();

        System.out.println("Enter width:");
        int width = sc.nextInt();

        System.out.println("Enter height:");
        int height = sc.nextInt();

        System.out.println("Enter number of windows:");
        int windows = sc.nextInt();

        System.out.println("Enter number of doors:");
        int doors = sc.nextInt();

        //calculation
        int totalArea = ((length * 2) * height) + ((width * 2) * height);
        totalArea -= (windows * 15);
        totalArea -= (doors * 21);

        int totalPaint = totalArea / paintCoverage;
        double quartsOfPaint = (double)(totalArea) / (double)(paintCoverage) * 4.0;

        //output
        System.out.println("The total gallons of paint is: " + totalPaint + " gallons.");
        System.out.println("The total quarts of paint is: " + quartsOfPaint + " quarts.");
    }
}
