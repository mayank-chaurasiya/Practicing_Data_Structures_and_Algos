import java.util.Scanner;

public class palindromic_number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= (2 * line) - (2 * i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 2; j--) {
                System.out.print(j);
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= (2 * line) - (2 * i); j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
        sc.close();
    }
}
