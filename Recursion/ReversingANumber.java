import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Reversed Number : ");
        reverse(num);
    }

    static void reverse(int num) {
        int prod = 1;
        if (num == 0) {
            return;
        }
        prod = num % 10;
        System.out.print(prod);
        reverse(num / 10);

    }
}