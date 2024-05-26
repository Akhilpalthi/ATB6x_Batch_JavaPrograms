package Practise_Sessions_java.Prac_04052024;

import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check Palindrome");
        String str1=sc.nextLine().toLowerCase();
        String str2 = "";
        char ch;
        for (int i=str1.length()-1; i>=0; i--) {
            str2 = str2 + str1.charAt(i);
                        System.out.println(str2);

        }
        if(str1.equals(str2.toString())){
            System.out.println("Given word is Palindorme");
        }else{
            System.out.println("Given word is not Palindrome");
        }


    }
}
