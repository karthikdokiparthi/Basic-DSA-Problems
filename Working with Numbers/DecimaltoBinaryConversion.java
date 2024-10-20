import java.util.Scanner;

public class DecimaltoBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int prod;
        int place = 1;
        if (num == 0) {
            System.out.println("the binary number : 0");
        } else {
            while (num > 0) {
                prod = num % 2;
                sum = prod * place + sum;
                num = num / 2;
                place *= 10;
            }
            System.out.println(sum);
        }
    }
}
