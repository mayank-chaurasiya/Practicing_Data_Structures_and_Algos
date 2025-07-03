//program to find the average of 3 numbers inputed from the user.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        in.close();

        float average = (num1 + num2 + num3) / 3;

        System.out.println("Average of 3 numbers is : " + average);

    }
}
