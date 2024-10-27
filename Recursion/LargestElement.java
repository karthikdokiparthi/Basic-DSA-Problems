import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }

        int res = findElement(arr, 0, 0);
        System.out.println("The Maxmimun : " + res);
    }

    static int findElement(int arr[], int i, int max) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return findElement(arr, i + 1, max);
    }
}
