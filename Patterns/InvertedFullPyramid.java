public class InvertedFullPyramid {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
