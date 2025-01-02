public class DiamondPattern {
    public static void main(String[] args) {
        int num = 4;
        int noc = 1, nor = 4;

        for (int i = 1; i < num * 2; i++) {
            for (int j = 1; j < nor; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= noc; j++) {
                System.out.print("* ");
            }
            if (i < num) {
                noc++;
                nor--;
            } else {
                noc--;
                nor++;
            }
            System.out.println();
        }
    }
}
