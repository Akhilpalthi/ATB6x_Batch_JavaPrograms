package Practise_Sessions_java.Prac_20042024;

public class valueofx {
    public static void main(String[] args) {
        int x=10;
        float y=12.4f;
        float z=56.78f;

        double result = Math.cbrt((x*x)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        double math1= x*x;
        double math2=Math.pow(y,2);
        double math3=Math.abs(z);
        System.out.println(math1+" "+math2+" "+math3);


    }
}
