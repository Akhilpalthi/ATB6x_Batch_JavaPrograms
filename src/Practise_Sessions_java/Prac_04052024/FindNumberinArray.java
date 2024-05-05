package Practise_Sessions_java.Prac_04052024;

import java.util.Scanner;
public class FindNumberinArray {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 12, 6},
                {7, 8, 9}
        };

        System.out.println("----Identifying given number in matrix----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked in Array");
        int int_check = sc.nextInt();
        int row=-1;
        int col=-1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] == int_check) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        if(row!=-1&&col!=-1) {
            System.out.println("Number " + int_check + " is available" + " at position (" + (row) + "," + (col) + ")");
        }else{
            System.out.println("Number " + int_check + " is not found");
        }
    }
}
