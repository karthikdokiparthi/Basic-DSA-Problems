import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = harshadNumber(num);
        if (num % result == 0) {
            System.out.println("It is a Harshad number");
        } else {
            System.out.println("Its is not a Harshad number");
        }

    }

    static int harshadNumber(int num) {
        int sum = 0;
        int prod;
        while (num != 0) {
            prod = num % 10;
            sum += prod;
            num /= 10;
        }
        return sum;
    }
}
