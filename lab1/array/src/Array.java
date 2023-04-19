import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("The array elements are:");
        for (int number : numbers) {
            System.out.printf(number + " ");
        }
        System.out.printf("\n");
        Arrays.sort(numbers);
        System.out.println("The sorted array: " + Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        double average = 0;
        average = (double) sum / numbers.length;
        System.out.println("Average of array elements: " + average);
    }
}
