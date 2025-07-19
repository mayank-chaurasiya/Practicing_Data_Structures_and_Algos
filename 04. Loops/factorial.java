import java.util.Scanner;

public class factorial {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        if (n == 0 || n == 1) {
            System.out.println("Factorial of " + n + " is 1");
        } else {
            System.out.println("Factorial of " + n + " is " + factorial);
        }
        sc.close();
    }
}
