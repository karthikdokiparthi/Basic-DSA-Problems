//     A
//    B B
//   C   C
//  D     D
//   C   C
//    B B
//     A

public class DiamondShapewithAlphabets {
    public static void main(String[] args) {
        int ch = 64;
        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.print((char) (ch + i));

            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char) (ch + i));
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.print((char) (ch + i));
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char) (ch + i));
            }
            System.out.println();
        }
    }
}
