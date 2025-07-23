import java.util.Scanner;

public class inverted_halfpyramid_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int line = sc.nextInt();

        for(int i = 1; i <= line; i++) {
            for(int j = 1; j <= line - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
