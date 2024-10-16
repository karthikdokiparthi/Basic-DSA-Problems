import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = factor(num);

        if (num == result) {
            System.out.println("Its a Perfect number");
        } else {
            System.out.println("Its is not a Perfect number");
        }
    }

    public static int factor(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
