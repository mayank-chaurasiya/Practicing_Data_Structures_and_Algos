import java.util.Scanner;

public class hollow_rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();
        int row = 1;
        int stars = n;
        int spaces = n - 2;

        while (row <= n - 1) {
            if (row == 1 || row == n - 1) {
                for (int i = 0; i < stars; i++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int i = 0; i < spaces; i++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            row++;
            System.out.println();
        }

        sc.close();
    }
}