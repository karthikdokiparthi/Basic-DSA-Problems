
//Replace all 0’s with 1 in a given integer
import java.util.Scanner;

public class ReplaceZerowithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                str1 = str1 + '1';
            } else {
                str1 = str1 + str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
