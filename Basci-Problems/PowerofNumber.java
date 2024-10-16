import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();

        int result = power(num, exp);
        System.out.println(result);
    }

    public static int power(int num, int exp) {
        int product = 1;
        while (exp != 0) {
            product *= num;
            exp--;
        }
        return product;
    }
}
