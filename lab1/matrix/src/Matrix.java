import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices: ");
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[][] matrixA = new int[r][c];
        System.out.println("Enter matrix A: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixB = new int[r][c];
        System.out.println("Enter matrix B: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[][] result = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        System.out.println("The result: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
