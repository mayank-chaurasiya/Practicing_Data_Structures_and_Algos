//Write a Java Method to compute the average of three numbers

import java.util.Scanner;

public class practiceQ1 {
    public static double average(int n) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double average = sum / n;
        sc.close();
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total numbers : ");
        int n = sc.nextInt();
        System.out.println("The average is : " + average(n));
        sc.close();
    }
}
