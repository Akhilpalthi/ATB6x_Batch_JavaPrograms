package Practise_Sessions_java.Prac_04052024;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 12, 6},
                {7, 8, 9}
        };

        // Matrix Transpose
        System.out.println("----Matrix Transpose----");
        int arr2[][] = new int[arr1[0].length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[j][i] = arr1[i][j];
            }

        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
