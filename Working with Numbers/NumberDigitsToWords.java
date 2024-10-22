//Program to convert Digits/Numbers to Words

import java.util.Scanner;

public class NumberDigitsToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        String str = convertDigits(num);
        System.out.println(str);
    }

    static String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen" };

    static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    static String convertDigits(int num) {
        if (num < 20) {
            return units[num];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 != 0 ? "-" + units[num % 10] : "");
        } else if (num < 1000) {
            return units[num / 100] + " hunderd" + (num % 100 != 0 ? "-" + convertDigits(num % 100) : "");
        } else if (num < 10000) {
            return units[num / 1000] + " thousand" + (num % 1000 != 0 ? "-" + convertDigits(num % 1000) : "");
        }
        return "";
    }
}
