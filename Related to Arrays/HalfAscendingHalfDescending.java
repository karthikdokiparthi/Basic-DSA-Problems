
//Sort first half in ascending order and second half in descending
import java.util.Scanner;

public class HalfAscendingHalfDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int half = (arr.length / 2);
        System.out.print("First Half Assending Order : ");
        for (int i = 0; i < half; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Second Half Descending Order : ");
        for (int i = arr.length - 1; i >= half; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
