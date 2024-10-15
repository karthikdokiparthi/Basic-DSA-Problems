import java.util.*;

public class PrimeNumberinGivenRange {
    static boolean primeorNot(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (primeorNot(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
