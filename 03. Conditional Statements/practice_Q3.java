//Q3. write a java program to input week number(1-7) and print day of week name using switch case.

import java.util.Scanner;

public class practice_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of weekdays(1-7) : ");
        int w = sc.nextInt();

        switch (w) {
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
        
            default:   System.out.println("Please Enter number between 1 to 7.");
                break;
        }
        sc.close();
    }
}
