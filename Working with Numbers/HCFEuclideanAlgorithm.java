import java.util.Scanner;

public class HCFEuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int result = euclidean(num1, num2);
        System.out.println(result);

    }

    static int euclidean(int num1, int num2) {
        int hcf;
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            while (num2 != 0) {
                hcf = num1 % num2;
                num1 = num2;
                num2 = hcf;
            }
        }
        return num1;
    }
}
