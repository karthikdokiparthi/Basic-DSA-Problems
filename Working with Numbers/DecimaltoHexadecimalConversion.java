import java.util.Scanner;

public class DecimaltoHexadecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("The Hexadecimal is 0");
        } else {
            char arr[] = new char[100];
            int prod = 1, i = 0;
            while (num != 0) {
                prod = num % 16;
                if (prod < 10) {
                    arr[i] = (char) (prod + 48);
                    i++;
                } else {
                    arr[i] = (char) (prod + 55);
                    i++;
                }
                num /= 16;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
        }

    }

}
