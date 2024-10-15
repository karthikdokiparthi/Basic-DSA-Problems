import java.util.*;

public class LeapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year number : ");
        int year = sc.nextInt();
        // method 1
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Its a Leap Year");
        } else {
            System.out.println("Its not a Leap Year");
        }
        // method 2
        // boolean flag = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true :
        // false;
        // if (flag == true) {
        // System.out.println("Its a leap year");
        // } else {
        // System.out.println("Its not a leap year");
        // }
    }
}
