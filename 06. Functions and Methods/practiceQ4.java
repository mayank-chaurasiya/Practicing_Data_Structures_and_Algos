//Write a java Method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class practiceQ4 {
    public static void sumDigits(int n) {
        int num = n;
        int sum = 0;
        while(n != 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        System.out.println("Sum of the digits of " + num + " is " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        sumDigits(n);
        sc.close();
    }
}
