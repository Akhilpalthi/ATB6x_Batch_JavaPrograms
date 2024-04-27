package Practise_Sessions_java.Prac_23042024;
import java.util.Scanner;
public class Largest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();


        if(num1>num2 && num1 >num3){
            System.out.println("num1 -> "+num1);
        } else if (num2>num3 && num2>num1) {
            System.out.println("num2 ->"+num2);

        }else{
            System.out.println("num3 ->"+num3);
        }
        sc.close();

    }
}
