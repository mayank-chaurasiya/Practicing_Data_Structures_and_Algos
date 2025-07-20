import java.util.Scanner;

public class half_pyramid_of_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int line = sc.nextInt();

        int total_rows = line;
        int nums = line;
        int row = 1;

        while (row <= total_rows) {
            for(int i = 1; i <= nums; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
            row++;
            nums--;
        }
        sc.close();
    }
}
