//     1
//   2   3
// 4       5
//   6   7
//     8

public class ZigZagNumberPattern {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.print(count++);
            if (i > 1 && i <= num) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(count++);
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= i + 1; j--) {
                System.out.print(" ");
            }
            System.out.print(count++);
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
