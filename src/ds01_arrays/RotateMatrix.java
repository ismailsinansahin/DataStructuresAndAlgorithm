package ds01_arrays;

import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args) {
        int size = getTheSizeOfTheMatrix();
        int [][] originalMatrix = createTheMatrix(size);
        System.out.println("**** ORIGINAL MATRIX *****");
        displayTheMatrix(originalMatrix);
        int[][] newMatrix = rotateTheMatrix(originalMatrix);
        System.out.println("**** ROTATED MATRIX  *****");
        displayTheMatrix(newMatrix);
    }

    private static int getTheSizeOfTheMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the array : ");
        int size = scanner.nextInt();
        scanner.close();
        return size;
    }

    private static int[][] createTheMatrix(int size) {
        int[][] array = new int[size][size];
        int number=1;
        for (int i=0 ; i<size ; i++){
            for (int j=0 ; j<size ; j++){
                array[i][j]=number;
                number++;
            }
        }
        return array;
    }

    private static void displayTheMatrix(int[][] matrix) {
        for (int i=0 ; i<matrix.length ; i++){
            System.out.print("|");
            for (int j=0 ; j<matrix.length ; j++){
                System.out.printf(" %2d " + "|", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] rotateTheMatrix(int[][] matrix) {
        int temp;
        int k=0;
        for (int i=matrix.length-1 ; i>=matrix.length/2 ; i--,k++){
            for (int j=i ; j>k ; j--) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i-j+k][i];
                matrix[i-j+ k][i] = matrix[k][i-j+k];
                matrix[k][i-j+k] = matrix[j][k];
                matrix[j][k] = temp;
            }
        }
        return matrix;
    }

}
