import java.util.Scanner;

public class LengthofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence or Name : ");
        String str = sc.next();
        int res = countString(str);
        // int res = countString(str,0);
        System.out.println("length of the string : " + res);
    }

    static int countString(String str) {
        if (str == "") {
            return 0;
        }
        return 1 + countString(str.substring(1));
    }

    // static int countString(String str, int count) {
    // if (count == str.length()) {
    // return count;
    // }
    // return countString(str, count + 1);
    // }
}
