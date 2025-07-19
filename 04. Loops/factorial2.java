import java.util.Scanner;

public class factorial2 {

    public static long findFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
        } else {
            long result = findFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
        sc.close();
    }
}
