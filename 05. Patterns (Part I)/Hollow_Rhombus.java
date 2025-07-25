import java.util.Scanner;

public class Hollow_Rhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // print spaces (leading spaces)
            }
            // Print asterisks (boundary)
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* "); // Print asterisks for the first and last row, and first and last column
                } else {
                    System.out.print("  "); // Print spaces for the inside
                }
            }
            System.out.println();
            sc.close();
        }
    }
}