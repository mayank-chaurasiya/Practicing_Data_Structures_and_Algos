import java.util.*;

public class Income_Tax_Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int income = in.nextInt();
        int tax;
        in.close();
        if(income < 500000) {
            tax = 0;
        } 
        else if(income >= 500000 && income < 1000000) {
            tax = (int)(income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("your tax is : " + tax);
    }
}
