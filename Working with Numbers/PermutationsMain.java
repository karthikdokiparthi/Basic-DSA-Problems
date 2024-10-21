
//The number of permutations in which n people can occupy r seats in a classroom is given by the formula for permutations:
//P(n,r)=n!/(n-r)!
import java.util.Scanner;

public class PermutationsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of seats (r): ");
        int r = sc.nextInt();
        if (r > n) {
            System.out.println("Number of seats cannot be greater than number of people.");
        } else {
            long result = permutations(n, r);
            System.out.println("The number of ways " + n + " people can occupy " + r + " seats is: " + result);
        }
    }

    static long permutations(int n, int r) {
        long result = factoral(n) / factoral(n - r);
        return result;
    }

    static long factoral(int n) {
        int p = 1;
        while (n > 0) {
            p *= n;
            n--;
        }
        return p;
    }

}
