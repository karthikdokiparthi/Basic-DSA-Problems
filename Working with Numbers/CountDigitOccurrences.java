
//Finding Number of times x digit occurs in a given input
import java.util.Scanner;

public class CountDigitOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = sc.nextLong();
        System.out.print("Enter the digit to count: ");
        int x = sc.nextInt();
        int count = countDigits(number, x);
        System.out.println("Digit " + x + " occurs " + count + " times in the number " + number);
    }

    static int countDigits(long num, int x) {
        int sum = 0;
        while (num != 0) {
            long prod = num % 10;
            if (prod == x) {
                sum++;
            }
            num /= 10;
        }
        return sum;
    }

}
