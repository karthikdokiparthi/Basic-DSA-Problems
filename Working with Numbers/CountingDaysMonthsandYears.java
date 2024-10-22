
//Counting number of days in a given month of a year
import java.util.Scanner;

public class CountingDaysMonthsandYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        int days = daysInMonth(month, year);
        System.out.println("Number of days: " + days);

    }

    static int daysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return leapYearorNot(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    static boolean leapYearorNot(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
