public class AlphabetTriangle {
    public static void main(String[] args) {
        int num = 5;
        int ch = 64;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }
    }
}
