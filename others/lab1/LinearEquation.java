package lab1;
import java.util.Scanner;
public class LinearEquation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a11, a12, b1: ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1  = scanner.nextDouble();
        System.out.println("Please enter a21, a22, b2: ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2  = scanner.nextDouble();
        scanner.close();

        double det = (a11 * a22) - (a21 * a12); // Determinant of the coefficient matrix
        if (det == 0.0) {
            System.out.println("ERROR: The coefficient matrix is singular, cannot be inverted.");
            return;
        }

        double x = ((b1 * a22) - (b2 * a12)) / det;
        double y = ((a11 * b2) - (a21 * b1)) / det;

        System.out.println("Solution: x = " + x + ", y = " + y);

    }   
}
