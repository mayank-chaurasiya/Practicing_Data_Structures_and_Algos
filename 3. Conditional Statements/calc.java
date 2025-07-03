import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();
        
        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);

        sc.close();

        switch (operator) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
        
            default: System.out.println("Please use simple operators only!!");
                break;
        }
    }
}
