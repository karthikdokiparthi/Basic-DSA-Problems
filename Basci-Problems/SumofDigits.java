import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int result = num % 10;
            sum += result;
            num = num / 10;
        }
        System.out.println("the sum of number : " + sum);
    }
}
