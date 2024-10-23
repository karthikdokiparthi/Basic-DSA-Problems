
//Write a program to find roots of a quadratic equation in Java
import java.util.Scanner;

public class RootsofQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        int a = sc.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = sc.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = sc.nextInt();
        findRoots(a, b, c);
    }

    static void findRoots(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        double sqrt_value = Math.sqrt(d);
        if (d > 0) {
            double root1 = (-b + sqrt_value) / (2 * a);
            double root2 = (-b - sqrt_value) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Root is real and repeated.");
            System.out.println("Root: " + root);
        } else // d < 0
        {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
