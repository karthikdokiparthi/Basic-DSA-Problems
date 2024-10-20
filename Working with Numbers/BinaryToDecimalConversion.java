import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int num = sc.nextInt();// 1011
        int prod;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            prod = num % 10;
            sum += prod * (Math.pow(2, count));
            count++;
            num = num / 10;
        }
        System.out.println("The decimal number of given binary number : " + sum);

    }
}
