// Q4. Write a java prorgram that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class practice_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year (YYYY) : ");
        int year = sc.nextInt();

//Approach 1 : 
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

// Approach 2 : using ternary operator--
        boolean isLeapYear = (year % 4) == 0 ? (year % 100) == 0 ? (year % 400) == 0 ? true : false : true : false;
        System.out.println(isLeapYear);

// Approach 3 : Using Logical operator and if
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (((year % 100) == 0) && ((year % 400) == 0));

        if(x && (y || z)) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("Its not a leap year");
        }
        sc.close();
    }
}
