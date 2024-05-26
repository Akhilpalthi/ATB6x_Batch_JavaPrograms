package Practise_Sessions_java.Prac_04052024;

import java.util.Scanner;
public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        String str1 = sc.nextLine();
        StringBuffer str2=new StringBuffer(str1);
        str2.reverse();
        System.out.println("Reversed string: "+str2);

    }

}
