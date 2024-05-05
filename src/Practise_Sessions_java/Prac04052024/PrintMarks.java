package Practise_Sessions_java.Prac04052024;

import java.security.DrbgParameters;
import java.util.Scanner;
public class PrintMarks {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Array1");
        marks[0]=sc.nextInt();
        System.out.println("Array2");
        marks[1]=sc.nextInt();
        System.out.println("Array3");
        marks[2]=sc.nextInt();
        System.out.println("Array4");
        marks[3]=sc.nextInt();
        System.out.println("Array5");
        marks[4]=sc.nextInt();

        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]<30){
                System.out.println("Failed with Marks "+marks[i]);
            }else
                System.out.println("Array"+(i+1)+":"+marks[i]);
        }




    }


}
