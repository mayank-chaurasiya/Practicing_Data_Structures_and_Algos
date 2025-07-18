//Q2. Check weather you've fever or not?

import java.util.Scanner;

public class practice_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current Body temperature : ");
        double temp = sc.nextDouble();

        if (temp >= 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("your temperature is normal.");
        }
        sc.close();
    }
}
