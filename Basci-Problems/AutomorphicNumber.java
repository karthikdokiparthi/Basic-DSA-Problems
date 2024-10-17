import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = automorphic(number);
        if (result == 1) {
            System.out.println("Its a Automorphic Number");
        } else {
            System.out.println("Not a Automorphic Number");
        }
    }

    public static int automorphic(int num) {
        int prod = num * num;
        while (num != 0) {
            if (num % 10 != prod % 10) {
                return 0;
            }
            prod /= 10;
            num /= 10;
        }
        return 1;
    }
}
