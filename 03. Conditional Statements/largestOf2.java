import java.util.Scanner;

public class largestOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1 > num2) {
            System.out.println("\n" + num1 + " is larger than " + num2);
        }
        else if(num1 < num2) {
            System.out.println("\n" + num1 + " is smaller than " + num2);
        }
        else {
            System.out.println("\n" + num1 + " is equal to " + num2);
        }
    }
}

