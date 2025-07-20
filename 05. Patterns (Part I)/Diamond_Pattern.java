import java.util.Scanner;

public class Diamond_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");

        int n = sc.nextInt(), spaces = n - 1, stars = 1;

        for (int i = 1; i <= n; i++) { // to move to the next row
            for (int j = 1; j <= spaces; j++) { // print spaces
                System.out.print("  ");
            }

            for (int k = 1; k <= stars; k++) { // Print stars after stars.
                System.out.print("* ");
            }
            spaces--;
            stars += 2;
            System.out.println();
        }

        spaces = 0;
        stars = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("* ");
            }

            spaces++;
            stars -= 2;
            System.out.println();
        }

        sc.close();
    }
}
