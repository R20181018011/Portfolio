import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            // Declare 3x3 array
            int[][] numbers = new int[3][3];
            int diagonal1 = 0;
            int diagonal2 = 0;
            // Input 9 elements
            System.out.println("Input 9 elements:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    numbers[i][j] = input.nextInt();
                }
            }
            // Display matrix and row sums
            System.out.println("\nHere are the Numbers and the required outputs:");
            System.out.println("==============================================");
            System.out.printf("%45s%n", "Row Sum");
            for (int i = 0; i < 3; i++) {
                int rowSum = 0;
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%8d", numbers[i][j]);
                    rowSum += numbers[i][j];
                }
                System.out.printf("%20d%n", rowSum);
            }
            // Calculate column sums
            System.out.print("\nColumn sum: ");
            for (int j = 0; j < 3; j++) {
                int columnSum = 0;
                for (int i = 0; i < 3; i++) {
                    columnSum += numbers[i][j];
                }
                System.out.printf("%8d", columnSum);
            }
            // Calculate first diagonal
            for (int i = 0; i < 3; i++) {
                diagonal1 += numbers[i][i];
            }
            // Calculate second diagonal
            for (int i = 0; i < 3; i++) {
                diagonal2 += numbers[i][2 - i];
            }
            // Display diagonal sums
            System.out.println("\n\n==============================================");
            System.out.println("Diagonal sum 1: " + diagonal1);
            System.out.println("Diagonal Sum 2: " + diagonal2);
            // Ask to try again
            System.out.print("\nTry Again [y|n]: ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        input.close();
        System.out.println("Program Ended.");
    }
}