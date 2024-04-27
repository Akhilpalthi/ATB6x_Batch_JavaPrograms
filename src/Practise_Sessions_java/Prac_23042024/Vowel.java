package Practise_Sessions_java.Prac_23042024;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a Character");
        char ch=sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println("Entered char is a Vowel");
        }else {
            System.out.println("Entered Char is Consonant");
        }sc.close();

    }
}
