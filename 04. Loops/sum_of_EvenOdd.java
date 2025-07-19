import java.util.Scanner;

public class sum_of_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of Integers : ");
        int total = sc.nextInt();
        int even_sum = 0, odd_sum = 0;

        System.out.println("\nYour integers : ");
        for (int i = 1; i <= total; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                even_sum += n;
            } else {
                odd_sum += n;
            }
        }

        System.out.println("Sum of the even numbers are : " + even_sum + " \nand the sum of odd numbers are : " + odd_sum);
        sc.close();
    }
}
