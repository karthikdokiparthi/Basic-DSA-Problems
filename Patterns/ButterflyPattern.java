public class ButterflyPattern {
    public static void main(String[] args) {
        int num = 5;
        int noc = 1, nor = num * 2 - 1;
        for (int i = 1; i < num * 2; i++) {
            for (int j = 1; j <= num * 2; j++) {
                if (j <= noc || j >= nor) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < num) {
                noc++;
                nor--;
            } else {
                noc--;
                nor++;
            }
        }

    }
}
