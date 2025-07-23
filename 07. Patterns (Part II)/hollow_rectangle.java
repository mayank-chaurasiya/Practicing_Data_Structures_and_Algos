import java.util.Scanner;

public class hollow_rectangle {

    public static void hollowRectangle(int totRows, int totcols) {
        for(int i = 1; i <= totRows; i++) {
            for(int j = 1; j <= totcols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totcols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of column : ");
        int columns = sc.nextInt();

        hollowRectangle(rows, columns);
        sc.close();
    }
}