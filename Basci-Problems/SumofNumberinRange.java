import java.util.Scanner;

public class SumofNumberinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting Range of Number : ");
        int n = sc.nextInt();
        System.out.print("Enter Last Range of Number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = n; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers in given range : " + sum);
    }
}
