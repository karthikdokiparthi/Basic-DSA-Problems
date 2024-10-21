import java.util.Scanner;

public class DecimaltoOctalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int placeHolder = 1;
        if (num == 0) {
            System.out.println("The Octal number is 0");
        } else {
            while (num > 0) {
                int prod = num % 8;
                sum = prod * placeHolder + sum;
                placeHolder *= 10;
                num /= 8;
            }
            System.out.println(sum);
        }

    }
}
