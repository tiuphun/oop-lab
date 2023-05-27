package lab1;
import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        scanner.close();
        System.out.println(sum(a, b) + difference(a,b) + product(a, b) + quotient(a, b));
    }
    public static double sum (double a, double b) {
        return a + b;
    }
    public static double difference (double a, double b) {
        return Math.abs(a - b);
    }
    public static double product (double a, double b) {
        return a * b;
    }
    public static double quotient (double a, double b) {
        return a/b;
    }

    
}
