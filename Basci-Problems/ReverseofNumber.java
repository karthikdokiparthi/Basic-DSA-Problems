import java.util.Scanner;

public class ReverseofNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int reverse;
        int sum = 0;
        while (num != 0) {
            reverse = num % 10;// 1234
            sum = reverse + (sum * 10);
            num = num / 10;
        }
        System.out.println("Resverse of a entered number : " + sum);
    }
}