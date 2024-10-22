//Find the prime numbers between 1 to 100 
public class PrimeNumbers {
    public static void main(String[] args) {
        int range = 100;
        for (int i = 2; i <= range; i++) {
            if (prime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    static int prime(int num) {
        int res = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                res = 0;
                break;
            }
        }
        return res;
    }
}
