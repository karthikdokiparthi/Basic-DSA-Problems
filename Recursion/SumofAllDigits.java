import java.util.Scanner;

public class SumofAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int res = sumofGivenNumber(num, 0);
        System.out.println("The sum of all digits of a given number is : " + res);
    }

    static int sumofGivenNumber(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        sum = sum + num % 10;
        return sumofGivenNumber(num / 10, sum);
    }
}
