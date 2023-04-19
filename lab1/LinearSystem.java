package lab1;
import java.util.Scanner;
public class LinearSystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        scanner.close();
        
        if (a == 0) {
            System.out.println("x = " + -b);
        }
        else {
            System.out.println("x = " + -b/a);
        }
    }
}
