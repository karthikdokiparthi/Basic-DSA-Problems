import java.util.Scanner;

public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int num) {
        int prod = 1;
        for (int i = num; i >= 1; i--) {
            prod *= i;
        }
        return prod;
    }
}
