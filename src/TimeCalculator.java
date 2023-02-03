/**
 * @Class: TimeCalculator
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 7, 2023
 * Description: This program convert a given total number of seconds into hours, minutes and seconds.
 */

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input value
        System.out.println("Please enter the total number of seconds:");
        int totalSecond = sc.nextInt();

        //Calculation of time
        int second = totalSecond % 60;
        int hour = totalSecond / 60;
        int minute = hour % 60;
        hour = hour / 60;

        //output
        System.out.println(hour + " hours " + minute + " minutes " + second + " second ");
    }
}
