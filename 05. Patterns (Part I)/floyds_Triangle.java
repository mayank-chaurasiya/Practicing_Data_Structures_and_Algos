import java.util.Scanner;

public class floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        int total_rows = lines, 
            row = 1, 
            num = 1,  
            stars = 1;

        while (row <= total_rows) {
            for(int i = 1; i <= stars; i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            stars++;
            row++;
        }
        sc.close();
    }
}
