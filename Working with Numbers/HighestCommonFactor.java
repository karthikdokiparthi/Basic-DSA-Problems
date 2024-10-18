import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(" Highest Common Factor : " + hcf);
    }
}