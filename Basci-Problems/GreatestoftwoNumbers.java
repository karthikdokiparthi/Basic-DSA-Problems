import java.util.Scanner;

public class GreatestoftwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // method 1
        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("both are Equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }
        // method 2
        // int temp;
        // if (num1 == num2) {
        // System.out.println("both are Equal");
        // } else {
        // temp = num1 > num2 ? num1 : num2;
        // System.out.println(temp + " is greater");
        // }
        // method 3
        // if (num1 == num2) {
        // System.out.println("both are Equal");
        // } else {
        // temp = Math.max(num1, num2);
        // System.out.println(temp + " is greater");
        // }
    }
}
