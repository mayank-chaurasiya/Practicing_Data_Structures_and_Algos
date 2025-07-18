import java.util.*;

public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : " );
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : " );
        int num2 = sc.nextInt();
        System.out.print("Enter num3 : " );
        int num3 = sc.nextInt();
        sc.close();

        if((num1 >= num2) && (num1 >= num3)){
            System.out.println(num1 + " is greatest of all.");
        }
        else if(num2 >= num3) {
            System.out.println(num2 + " is greatest of all ");
        }
        else {
            System.out.println(num3 + " is the largest");
        }
    }
}
