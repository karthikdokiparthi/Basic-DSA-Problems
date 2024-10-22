//Java program to find number of digits in an integer

import java.util.Scanner;

public class DigitsOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        // count = (int) Math.log10(num) + 1;
        // count = String.valueOf(num).length();
        System.out.print("Number of Digits = " + count);
    }
}
