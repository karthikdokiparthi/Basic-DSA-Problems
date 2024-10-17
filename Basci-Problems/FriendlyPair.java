import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number : ");
        int num2 = sc.nextInt();
        int result1 = friendlyPair(num1);
        int result2 = friendlyPair(num2);

        if (num1 == result2 && num2 == result1) {
            System.out.println(num1 + " & " + num2 + " Its a Friendly Pair numbers");
        } else {
            System.out.println(num1 + " & " + num2 + " Its not a Friendly Pair numbers");
        }
    }

    static int friendlyPair(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
