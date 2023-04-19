import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the month: ");
        String monthString = scanner.next();
        int month = getMonthNumber(monthString);
        scanner.close();

        if (month == -1) {
            System.out.println("Invalid month entry. Please enter month as 'January', 'Jan', 'Jan.' or '1'.");
            return;
        }

        int numDays = getNumDays(month, year);
        System.out.println("Number of days in the specified month: " + numDays);
    }

    public static int getMonthNumber(String monthString) {
        String[] monthStrings = { "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december" };
        String[] abbrStrings = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
        String[] dotStrings = { "jan.", "feb.", "mar.", "apr.", "may.", "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec." };

        monthString = monthString.toLowerCase();
        for (int i = 0; i < monthStrings.length; i++) {
            if (monthString.equals(monthStrings[i])) {
                return i + 1;
            } else if (monthString.equals(abbrStrings[i]) || monthString.equals(dotStrings[i])) {
                return i + 1;
            }
        }

        try { 
            // Try to parse integer values for month
            int month = Integer.parseInt(monthString);
            if (month >= 1 && month <= 12) {
                return month;
            }
        } catch (NumberFormatException e) {
            // Do nothing
        }

        // If month is not valid, return -1
        return -1;
    }

    public static int getNumDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

}