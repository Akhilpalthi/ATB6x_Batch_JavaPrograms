package Practise_Sessions_java.Prac_23042024;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long num = sc.nextLong();
        boolean isPrime=false;
        if (num <= 1) {
            System.out.println("Please Enter a Natural Positive integer");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime =true;
                } else {
                    isPrime=false;
                }


            }
        }
        if(isPrime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}
