import java.util.Scanner;

public class OctalToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (num != 0) {
            int prod = num % 10;
            sum += prod * (Math.pow(8, count));
            count++;
            num /= 10;
        }
        System.out.println("The decimal number of given Octal number : " + sum);
    }
}
