import java.util.Scanner;

public class ReverseanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Reverse of an Array : ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
