import java.util.Scanner;

public class BinarytoOctalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int num = sc.nextInt();
        int sum = 0, count = 0;
        while (num != 0) {
            int prod = num % 10;
            sum += prod * Math.pow(2, count);
            count++;
            num /= 10;
        }
        System.out.println("Decimal : " + sum);
        int[] arr = new int[20];
        int i = 0;
        while (sum > 0) {
            int r = sum % 8;
            arr[i++] = r;
            sum /= 8;
        }
        System.out.print("Octal : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(arr[j]);

    }
}
