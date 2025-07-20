import java.util.Scanner;

public class inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total_rows = n;
        int stars = 1;
        int spaces = n - 1;

        int row = 1;

        while (row <= total_rows) {
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for (int i = 0; i < stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
            row++;
            spaces--;
            stars++;
        }
        sc.close();
    }
}
