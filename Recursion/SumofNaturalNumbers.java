import java.util.Scanner;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int res = sumofNumbers(num);
        System.out.println("The sum of Given Natural Numbers : " + res);
    }

    static int sumofNumbers(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumofNumbers(n - 1);
    }
}
