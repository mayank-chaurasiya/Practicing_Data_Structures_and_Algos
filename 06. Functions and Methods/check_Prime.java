import java.util.Scanner;

public class check_Prime {
    public static boolean checkPrime(int n) {
        // corner cases
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(checkPrime(n));
    }
}
