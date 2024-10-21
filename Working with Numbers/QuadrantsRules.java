import java.util.Scanner;

public class QuadrantsRules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value : ");
        int x = sc.nextInt();
        System.out.print("Enter y value : ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth Quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x != 0 && y == 0) {
            System.out.println("x-axis");
        } else if (x == 0 && y != 0) {
            System.out.println("y-axis");
        }
    }
}
