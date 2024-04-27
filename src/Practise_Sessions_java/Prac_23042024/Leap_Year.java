package Practise_Sessions_java.Prac_23042024;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Year number");
        long year=sc.nextLong();
        if(year%4==0){
            System.out.println("Year is Leap Year");
        }else{
            System.out.println("Year is non leap Year");
        }
        sc.close();

    }
}
