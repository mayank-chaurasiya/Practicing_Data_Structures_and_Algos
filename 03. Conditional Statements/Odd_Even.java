import java.util.*;

public class Odd_Even {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    int num = s.nextInt();
        s.close();

        if(num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}
