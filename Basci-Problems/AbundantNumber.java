import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = sumofDivider(num);
        if (result > num) {
            System.out.println("It is a Abundant number");
        } else {
            System.out.println("Not a Abundant number");
        }

    }

    static int sumofDivider(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
