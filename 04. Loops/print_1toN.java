import java.util.Scanner;

public class print_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int i = 1, sum = 0;

        while (i <= n) {
            System.out.print(i + " ");
            sum += i;
            i++;
        }
        System.out.println("\n" + sum + " is the sum of numbers between 1 to " + n);
        sc.close();

    }
}
