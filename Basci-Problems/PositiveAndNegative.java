import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The Number is Postive");
        } else if (num < 0) {
            System.out.println("The Number is Negative");
        } else {
            System.out.println("Zero ");
        }
    }
}