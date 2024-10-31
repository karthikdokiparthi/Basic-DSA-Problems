
//Find Second Smallest Element in an Array
import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        int result = secondMinValue(arr);
        System.out.println("Second Smallest element in an array : " + result);
    }

    private static int secondMinValue(int[] arr) {
        int min = arr[0];
        int secmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] < secmin) {
                secmin = arr[i];
            }
        }
        return secmin;
    }
}
