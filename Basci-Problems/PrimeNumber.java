import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        // method 1
        if (flag == true) {
            System.out.println(num + " Its a prime number");
        } else {
            System.out.println(num + " Its Not a prime number");
        }

        // method 2
        // String result = flag ? "a Prime number" : "not a Prime number";
        // System.out.println(num + " Its " + result);

    }
}
