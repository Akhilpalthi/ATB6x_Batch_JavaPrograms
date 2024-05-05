package Practise_Sessions_java.Prac04052024;
import java.util.Arrays;
import java.util.Scanner;
public class DoubleAndStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        System.out.println("Enter Number 1");
        arr1[0]=sc.nextInt();
        System.out.println("Enter Number 2");
        arr1[1] = sc.nextInt();
        System.out.println("Enter Number 3");
        arr1[2] = sc.nextInt();

        int[] arr2 = new int[arr1.length];
        arr2[0]=arr1[0]*2;
        arr2[1]=arr1[1]*2;
        arr2[2]=arr1[2]*2;

        System.out.print("arr1:- ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("---------");
        System.out.print("arr2:- ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");

        }












    }
}
