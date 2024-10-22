
// Can a number be expressed as a sum of two prime numbers
import java.util.Scanner;

public class SumofTwoPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int x = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (prime(i) == 1) {
                if (prime(num - i) == 1) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    x = 1;
                }
            }

        }
        if (x == 0)
            System.out.println(+num + " cannot be expressed as a sum of two prime numbers");
    }

    static int prime(int num) {
        int flag = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}