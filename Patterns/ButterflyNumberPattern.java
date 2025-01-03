public class ButterflyNumberPattern {
    public static void main(String[] args) {
        int n = 4, noc = 1, nor = n * 2 - 1;
        for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j <= noc || j >= nor) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < n) {
                noc++;
                nor--;
            } else {
                noc--;
                nor++;
            }
        }
    }
}
