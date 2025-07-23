import java.util.Scanner;

public class hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of lines : ");
        int line = sc.nextInt();

        for(int i = 1; i <= line; i++) {
            for(int j = 1; j <= line - i; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= line; j++) {
                if(i == 1 || i == line || j == 1 || j == line) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
