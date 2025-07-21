public class primes_in_Range {
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

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(100);
    }
}
