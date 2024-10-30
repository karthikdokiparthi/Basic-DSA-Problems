import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int res = factorialNumber(num);
        System.out.println("The Factorial of " + num + " is : " + res);
    }

    static int factorialNumber(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorialNumber(num - 1);
    }
}
