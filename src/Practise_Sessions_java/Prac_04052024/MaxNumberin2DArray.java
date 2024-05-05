package Practise_Sessions_java.Prac_04052024;


public class MaxNumberin2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 12, 6},
                {7, 8, 9}
        };

//Identifying Max number in an Array//
        System.out.println("----Finding Max number----");
        int maxnumber = arr1[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > maxnumber) {
                    maxnumber = arr1[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }

        }
        System.out.println("Max Number in array is " + maxnumber + " at position (" + (maxRow + 1) + "," + (maxColumn + 1) + ")");

    }
}