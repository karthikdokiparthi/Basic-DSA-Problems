import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = primeorNot(num, 2);
        if (result == 1) {
            System.out.println(num + " is Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }

    static int primeorNot(int num, int i) {
        if (i == num) {
            return 1;
        }
        if (num % i == 0) {
            return 0;
        }
        return primeorNot(num, i + 1);
    }
}
