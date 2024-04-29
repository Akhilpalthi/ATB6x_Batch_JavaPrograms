package Practise_Sessions_java.Prac_25052024;
import java.util.Scanner;
public class SwitchArthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input 1");
        double in1=sc.nextDouble();
        System.out.println("Enter input 2");
        double in2=sc.nextDouble();
        System.out.println("-- Please Enter Arithmatic Operator you want to use?--");
        char ch =sc.next().charAt(0);
        switch(ch){
            case '+' :
                System.out.println(in1+in2);
                break;
            case '*':
                System.out.println(in1*in2);
                break;
            case '-':
                System.out.println(in1-in2);
                break;
            case '/':
                System.out.println(in1/in2);
                break;
            case '%':
                System.out.println(in1%in2);
                break;
            default:
                System.out.println("please enter a valid character");
        }
    sc.close();



    }

}
