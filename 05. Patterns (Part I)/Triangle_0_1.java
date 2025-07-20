import java.util.Scanner;

public class Triangle_0_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        //outer loop goes through the rows 
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) { // inner loop to print the value at individual positions
                if ((i + j) % 2 == 0) { // logic to check ** (rows + column) % 2 is odd or even if odd then print "0" if even then print "1"
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // To move to the next line.
        }
        sc.close();
    }
}