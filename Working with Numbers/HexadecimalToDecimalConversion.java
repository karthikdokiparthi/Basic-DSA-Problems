import java.util.Scanner;

public class HexadecimalToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal number : ");
        String digits = sc.next();

        int sum = convert(digits);
        System.out.println("The decimal number of given Hexadecimal number : " + sum);
    }

    static int convert(String hex) {
        String digits = "0123456789ABCDEF";
        int sum = 0;
        hex = hex.toUpperCase();
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            sum = sum * 16 + d;
        }
        return sum;
    }
}
