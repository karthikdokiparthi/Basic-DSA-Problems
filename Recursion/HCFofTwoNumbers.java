import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a 2nd number : ");
        int num2 = sc.nextInt();
        int res = hcfNumber(num1, num2, 1, 1);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + res);
    }

    static int hcfNumber(int num1, int num2, int res, int i) {

        if (num1 == i || num2 == i) {
            return res;
        }
        if (num1 % i == 0 && num2 % i == 0) {
            res = i;
        }
        return hcfNumber(num1, num2, res, i + 1);
    }

    // static void hcfNumber(int num1, int num2, int i) {
    // if (num1 == i || num2 == i) {
    // return;
    // }
    // if (num1 % i == 0 && num2 % i == 0) {
    // System.out.print(i + " ");
    // }
    // hcfNumber(num1, num2, i + 1);
    // }
}
