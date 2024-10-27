import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        int res = findMinimun(arr, arr[0], 0);
        System.out.println("The minimum number is : " + res);
    }

    static int findMinimun(int arr[], int min, int i) {
        if (i == arr.length) {
            return min;
        }
        if (min > arr[i]) {
            min = arr[i];
        }
        return findMinimun(arr, min, i + 1);
    }
}
