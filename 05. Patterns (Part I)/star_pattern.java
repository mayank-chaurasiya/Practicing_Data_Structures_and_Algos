import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of line : ");
        int lines = sc.nextInt();
        sc.close();
        for(int i = 1; i <= lines; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
}