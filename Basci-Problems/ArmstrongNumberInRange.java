import java.util.*;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a staring number :");
        int low = sc.nextInt();
        System.out.print("Enter a Ending number :");
        int heigh = sc.nextInt();
        System.out.println("Armstrong start : " + low + " ending : " + heigh);
        System.out.println("these are the in between Arstrong Numbers in given range :");
        for (int num = low; num <= heigh; num++) {
            if (num == armstrong(num)) {
                System.out.print(num + " ");
            }
        }

    }

    public static int count(int num) {
        int sum = 0;
        while (num != 0) {
            sum++;
            num = num / 10;
        }
        return sum;
    }

    public static int power(int num, int exp) {
        int prod = 1;
        while (exp != 0) {
            prod *= num;
            exp--;
        }
        return prod;
    }

    public static int armstrong(int num) {
        int len = count(num);
        int sum = 0;
        while (num != 0) {
            int p = num % 10;
            sum += power(p, len);
            num = num / 10;
        }
        return sum;
    }
}
