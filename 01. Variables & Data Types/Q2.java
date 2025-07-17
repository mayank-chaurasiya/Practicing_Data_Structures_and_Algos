import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Square: ");
        int side = input.nextInt();
        input.close();

        int area = side * side;

        System.out.println("Area of Square is : " + area);
    }
}
