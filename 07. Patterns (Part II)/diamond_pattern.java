import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int line = sc.nextInt();

        //1st half
        for(int i = 1; i <= line; i++) {
            for(int j = 1; j <= (line - i); j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = line; i >= 1; i--) {
            for(int j = 1; j <= (line - i); j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
