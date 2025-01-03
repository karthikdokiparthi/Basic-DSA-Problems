// 1   2   3   4
// 12  13  14   5
// 11  16  15   6
// 10   9   8   7

public class SpiralNumberPattern {
    public static void main(String[] args) {
        int num = 4;
        int matrix[][] = new int[num][num];
        int top = 0, bottom = num - 1, left = 0, rigth = num - 1;
        int count = 1;
        while (top <= bottom && left <= rigth) {
            for (int i = left; i <= rigth; i++) {
                matrix[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][rigth] = count++;
            }
            rigth--;
            if (top <= bottom) {
                for (int i = rigth; i >= left; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }
            if (left <= rigth) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count++;
                }
                left++;
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
