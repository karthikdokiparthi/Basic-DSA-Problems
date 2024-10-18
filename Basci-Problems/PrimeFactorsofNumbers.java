import java.util.Scanner;

public class PrimeFactorsofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (prime(i) == 1) {
                int x = num;
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }

    static int prime(int num) {
        if (num < 2)
            return 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

}
