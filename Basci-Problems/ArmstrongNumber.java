import java.util.Scanner;

public class ArmstrongNumber {

    // count the digits
    static int count(int num) {
        int sum = 0;
        while (num != 0) {
            sum++;
            num = num / 10;
        }
        return sum;
    }

    // Square of a number
    static int square(int num, int power) {
        int prod = 1;
        while (power != 0) {
            prod *= num;
            power--;
        }
        return prod;
    }

    //
    static int armstrong(int num) {
        int sum = 0;
        int count = count(num);
        while (num != 0) {
            int res = num % 10;
            int power = square(res, count);
            sum += power;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = armstrong(num);
        if (num == result) {
            System.out.println("It is a Armstrong Number ");
        } else {
            System.out.println("It is Not a Armstrong Number ");
        }
    }
}
