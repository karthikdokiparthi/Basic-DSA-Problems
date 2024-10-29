import java.util.*;

public class SumofSubsets {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<Integer> result = getAllSum(arr);
        System.out.println(result + " ");
    }

    static void subSetsum(int arr[], int i, int currentSum, List<Integer> allSum) {
        if (i == arr.length) {
            allSum.add(currentSum);
            return;
        }
        subSetsum(arr, i + 1, currentSum + arr[i], allSum);
        subSetsum(arr, i + 1, currentSum, allSum);
    }

    static List<Integer> getAllSum(int arr[]) {
        List<Integer> allSum = new ArrayList<>();
        subSetsum(arr, 0, 0, allSum);
        return allSum;
    }
}
