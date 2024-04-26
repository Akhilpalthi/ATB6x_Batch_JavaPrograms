package Practise_Sessions_java.Prac_20042024;

public class Max_of_3_num {
    public static void main(String[] args) {


        int a=20;
        int b=30;
        int c=10;
        int max;
        int min;

        max= (a>b && a>c)? a: (b>c && b>a)?b:c;
        min= (a<b && a<c)? a: (b<c && b<a)?b:c;

        System.out.println("Laregst Number is "+ max);
        System.out.println("Smallest number is "+min);

    }







}
