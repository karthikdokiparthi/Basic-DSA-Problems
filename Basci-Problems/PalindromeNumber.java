import java.util.Scanner;

public class PalindromeNumber {

    static int palindrome(int num) {
        int prod;
        int sum = 0;
        while (num != 0) {
            prod = num % 10;
            sum = prod + (sum * 10);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = palindrome(num);
        if (result == num) {
            System.out.println(num + " its a PalindromeNumber");
        } else {
            System.out.println(num + " its not a PalindromeNumber");
        }
    }
}
