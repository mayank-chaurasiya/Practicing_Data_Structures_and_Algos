// Write a java program to check if a number is a palindrome in Java? (121 is a palindrome 321 is not)

import java.util.Scanner;

public class practiceQ3 {
    public static void main(String[] args) {
        int n, reversedNum = 0, remainder, originalNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        n = sc.nextInt();
        originalNum = n;

        while (n != 0) {
            remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;
        }

        if(originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }

        sc.close();
    }
}
