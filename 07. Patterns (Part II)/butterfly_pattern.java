import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        sc.close();
        for (int i = 1; i <= line; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= 2 * (line - i); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = line; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= 2 * (line - i); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
