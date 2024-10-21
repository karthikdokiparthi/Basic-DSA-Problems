import java.util.Scanner;

public class AdditionoftwoFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator of the first fraction: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator of the first fraction: ");
        int det1 = sc.nextInt();
        System.out.print("Enter numerator of the second fraction: ");
        int num2 = sc.nextInt();
        System.out.print("Enter denominator of the second fraction: ");
        int det2 = sc.nextInt();
        String str = addFraction(num1, num2, det1, det2);
        System.out.println("The sum of the fractions is: " + str);
    }

    static int LCM(int num1, int num2) {
        int prod1 = 1, prod2 = 1, result = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                prod1 = num1 / i;
                prod2 = num2 / i;
                result = prod1 * prod2 * i;
            }
        }
        return result;
    }

    static String addFraction(int num1, int num2, int det1, int det2) {
        int newnum1 = num1 * det2;
        int newnum2 = num2 * det1;
        int nume = (newnum1 + newnum2);
        int det = LCM(det1, det2);
        String result = nume + "/" + det;
        return result;
    }
}
