package Practise_Sessions_java.Prac_23042024;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Positive_Negative_NUm {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the input");
        int num =sc.nextInt();
        try{
            if(num>0) {
                System.out.println("ENtered number is Positive");
            }
            else if(num==0){
                System.out.println("Entered numnber is Zero");
            }
            else if(num<0){
                System.out.println("Entered number is negative->"+num);
            }
        }

        catch(NumberFormatException e){
            System.out.println("invalid input");
        }
        sc.close();

    }

}
