package Practise_Sessions_java.Prac_23042024;

public class FizzBuzzTest {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if (i%3==0) {
                System.out.println("Fizz");
            }else
                System.out.println(i);
        }
    }
}
