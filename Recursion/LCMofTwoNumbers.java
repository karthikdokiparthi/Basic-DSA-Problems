import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a 2nd number : ");
        int num2 = sc.nextInt();
        int res = gcdNumber(num1, num2, 0, 1);
        int lcm = num1 * num2 / res;
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    static int gcdNumber(int num1, int num2, int res, int i) {
        if (Math.max(num1, num2) == i) {
            return res;
        }
        if (num1 % i == 0 && num2 % i == 0) {
            res = i;
        }
        return gcdNumber(num1, num2, res, i + 1);
    }
}
