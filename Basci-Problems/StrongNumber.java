import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = addFactorial(num);

        if (result == num) {
            System.out.println("Its a Strong Number");
        } else {
            System.out.println("Its not a Strong number");
        }
    }

    public static int factorial(int num) {
        int prod = 1;
        for (int i = num; i >= 1; i--) {
            prod *= i;
        }
        return prod;
    }

    public static int addFactorial(int num) {
        int sum = 0;
        while (num != 0) {
            int prod = num % 10;
            sum += factorial(prod);
            num = num / 10;
        }
        return sum;
    }
}
