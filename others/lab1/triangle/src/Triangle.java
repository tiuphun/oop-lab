import java.util.Scanner;
public class Triangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("n = ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            // calculate the number of spaces needed before the stars
            int spaces = n - i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

