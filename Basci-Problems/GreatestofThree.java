import java.util.*;

public class GreatestofThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3nd Number : ");
        int num3 = sc.nextInt();
        // method 1
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the Greater");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the Greater");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is the Greater");
        }

        // method 2
        // int temp = num1 > num2 ? num1 : num2;
        // int result = num3 > temp ? num3 : temp;
        // System.out.println(result + " is the greater");
    }
}