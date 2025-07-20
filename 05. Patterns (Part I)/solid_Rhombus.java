import java.util.Scanner;

public class solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();

        int total_rows = n;
        int stars = 5;
        int spaces = n - 1;
        int row = 1;

        while (row <= total_rows) { 
            for(int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }

            for(int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }

            System.out.println();
            row++;
            spaces--;

        }
        sc.close();
    }
}
