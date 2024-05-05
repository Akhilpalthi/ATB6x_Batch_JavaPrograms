package Practise_Sessions_java.Prac04052024;

import java.util.Arrays;

public class MaxSalaryinArray {
    public static void main(String[] args) {
        int Salary[]={30,50,60,20,100,999};

        int maxsalary=Salary[0];
        //System.out.println(Arrays.stream(Salary).max());
        for (int i = 0; i < Salary.length;i++){
            if(Salary[i]>maxsalary){
                maxsalary=Salary[i];
            }
        }
        System.out.println("Max Salary in the Array is "+maxsalary);
    }
}

