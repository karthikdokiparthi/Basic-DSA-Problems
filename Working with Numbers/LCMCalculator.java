import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm1, lcm2, result = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                lcm1 = num1 / i;
                lcm2 = num2 / i;
                result = i * lcm1 * lcm2;
            }
        }
        System.out.println(result);
    }
}
