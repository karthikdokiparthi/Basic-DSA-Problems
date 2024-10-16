import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        if (num == 1) {
            System.out.print(num1 + " ");
        } else if (num == 2) {
            System.out.print(num1 + " " + num2);
        } else {
            System.out.print(num1 + " " + num2 + " " + num3 + " ");
            for (int i = 3; i < num; i++) {
                num1 = num2;
                num2 = num3;
                num3 = num1 + num2;
                System.out.print(num3 + " ");
            }
        }
    }
}
