import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(num, exp));
    }

    static int power(int num, int exp) {
        if (exp == 0) {
            return 1;
        }
        return (num * power(num, exp - 1));

    }
}