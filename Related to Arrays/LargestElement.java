
//Find Largest element in an array
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        int res = maxNumber(arr);
        System.out.println("The Largest Number in given array is : " + res);

    }

    static int maxNumber(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}