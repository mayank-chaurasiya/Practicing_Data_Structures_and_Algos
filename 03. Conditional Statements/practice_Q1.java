//Q1. Write a java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class practice_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        double num = sc.nextDouble();

        if(num > 0) {
            System.out.println(num + " is positive.");
        }
        else if(num < 0) {
            System.out.println(num + " is negative.");
        }
        else {
            System.out.println(num + " is neither negative nor positive.");
        }
        sc.close();
    }
}
