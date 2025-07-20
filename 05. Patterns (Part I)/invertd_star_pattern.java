import java.util.Scanner;

public class invertd_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line : ");
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= ((line - i) + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
