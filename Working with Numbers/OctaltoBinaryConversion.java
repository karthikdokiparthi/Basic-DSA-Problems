import java.util.Scanner;

public class OctaltoBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, count = 0;
        if (num == 0) {
            System.out.println("The Binary number 0");
        } else {
            // Octal to Decimal conversion
            while (num > 0) {
                int prod = num % 10;
                sum += prod * Math.pow(8, count);
                count++;
                num /= 10;
            }
            // Decimal to Binary
            int[] arr = new int[20];
            int i = 0;
            while (sum > 0) {
                int prod = sum % 2;
                arr[i++] = prod;
                sum /= 2;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
        }
    }
}
