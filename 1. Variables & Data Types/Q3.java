import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of Items (pencil, pen, eraser): ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();

        float total_cost = pencil + pen + eraser;

        float gst = (0.18f * total_cost) + total_cost;

        System.out.println("total price of the items : " + total_cost +  " and including gst : " + gst);

    }
}
