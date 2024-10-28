import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Reversed Number : ");
        System.out.println(reverse(num, 0));
    }

    static int reverse(int num, int sum) {
        int prod = 1;
        if (num == 0) {
            return sum;
        }
        prod = num % 10;
        sum = prod + sum * 10;
        return reverse(num / 10, sum);

    }
}