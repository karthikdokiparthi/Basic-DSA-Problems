
//Sort the elements of an array
import java.util.*;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted Array : ");
        System.out.print(Arrays.toString(arr));

    }
}
