package lab1;
import java.util.Scanner;
public class Quadratic {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        if (a == 0) {
            double root = -b/a;
            System.out.println("x = " + root);
            return;
        }
        
        double delta = b*b - 4*a*c;
        if (delta == 0) {
            double root = (-b) / (2 * a);
            System.out.println("Unique solution x = " + root);
        }
        else if (delta > 0) {
            double root1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double root2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " " + root2);
        }
        else {
            System.out.println("No solution.\n");
        }
    
    }
}
