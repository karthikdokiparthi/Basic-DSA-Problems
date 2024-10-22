
//Finding number of integers which has exactly x divisors
import java.util.Scanner;

public class DivisorCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 100;
        System.out.print("Enter the value of divisor : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % x == 0) {
                count++;
            }
        }
        System.out.println("Number of integers with exactly " + x + " divisors: " + count);
    }
}