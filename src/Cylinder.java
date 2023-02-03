/**
 * @Class: Cylinder
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 7, 2023
 * Description: This program is to calculate the base area and volume of a cylinder, given the radius of the base
 * circle and the length of the cylinder. Below are formulas of the area and volume of a cylinder.
 * Area of base= π * radius * radius
 * Volume= (area of base) * height
 */

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input values of the Cylinder
        double valuePI = 3.1416;
        System.out.println("Please enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.println("Please enter the height of the cylinder: ");
        double height = sc.nextDouble();

        //Calculation of the Cylinder
        double area = valuePI * radius * radius;

        double volume = area * height;

        //output
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
