import java.util.Scanner;

public class check_multiples_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");

        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("It's the multiple of 10.");
                break;
            }
            System.out.println("Not a multiple of 10");
        } while (true);

        sc.close();
    }
}
