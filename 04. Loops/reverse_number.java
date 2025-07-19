import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println(num + " can't be reversed.");
        } else {
            while (num > 0) {
                int lastDigit = num % 10;
                System.out.print(lastDigit);
                num /= 10;
            }
            System.out.println();
        }
        sc.close();
    }
}
