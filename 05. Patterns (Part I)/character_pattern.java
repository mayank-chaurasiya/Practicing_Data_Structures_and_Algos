import java.util.Scanner;

public class character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int line = sc.nextInt();
        char ch = 'A';
        sc.close();
        for (int i = 1; i <= line; i++) {
            for (char j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
