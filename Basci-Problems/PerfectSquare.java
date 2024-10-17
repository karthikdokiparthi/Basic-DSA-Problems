import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = square(num);
        if (result == true) {
            System.out.println("Perfect Square number");
        } else {
            System.out.println("not Perfect Square number");
        }
    }
    // method 1
    // public static boolean square(int num) {
    // int prod = (int) Math.sqrt(num);

    // if (num >= 0) {
    // return prod * prod == num;
    // } else {
    // return false;
    // }
    // }

    // method 2
    public static boolean square(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
