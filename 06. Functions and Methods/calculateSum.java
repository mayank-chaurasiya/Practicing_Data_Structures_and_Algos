import java.util.Scanner;

public class calculateSum {
    public static int calculatSum(int a, int b) { //parameters of formal parameter
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        int sum = calculatSum(a, b);// arguments
        System.out.println(sum + " is the sum of " + a + " and " + b);
        sc.close();
    }
}
