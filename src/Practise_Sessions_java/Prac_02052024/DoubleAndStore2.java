package Practise_Sessions_java.Prac_02052024;

import java.util.Arrays;

public class DoubleAndStore2 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7};
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i]*2;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
