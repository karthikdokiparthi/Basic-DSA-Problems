//The maximum number of handshakes that can occur when n people meet each other in a group is given by the formula for combinations:
//maximunHandshakes=n(n-1)/2

import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people (n): ");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("At least 2 people are required to have handshakes.");
        } else {
            int result = calculateHandshakes(num);
            System.out.println("The maximum number of handshakes among " + num + " people is: " + result);
        }
    }

    static int calculateHandshakes(int num) {
        int result = num * (num - 1) / 2;
        return result;
    }

}
