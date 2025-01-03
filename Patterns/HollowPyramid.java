//     *
//    * *
//   *   *
//  *     *
// *********

public class HollowPyramid {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            if (i != num) {
                System.out.print("*");
            }
            if (i > 1 && i != num) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if (i == num) {
                for (int j = 1; j < num * 2; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
