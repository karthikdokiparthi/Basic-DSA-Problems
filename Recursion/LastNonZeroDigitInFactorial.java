import java.util.Scanner;

public class LastNonZeroDigitInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int res = factorial(num);
        while (res % 10 == 0) {
            res /= 10;
        }
        System.out.println("The last non-zero digit in " + num + "! is: " + res % 10);
    }

    static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }
}
