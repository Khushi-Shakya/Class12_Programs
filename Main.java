import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Sort each row in descending order using Bubble Sort
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns - j - 1; k++) {
                    if (array[i][k] < array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted 2D array in descending order:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
