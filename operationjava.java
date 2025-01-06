
//Program to perform basic operations in java

import java.util.Scanner;

public class operationjava {
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static int sub(int a, int b, int c){
        return a - b - c;
    }
    public static int mul(int a, int b, int c){
        return a * b * c;
    }
    public static double add(double a, double b, double c){
        return a + b + c;
    }
    public static double sub(double a, double b, double c){
        return a - b - c;
    }
    public static double mul(double a, double b, double c){
        return a * b *c;
    }
    public static void main(String[] args) {
        float a,b,c;
        Scanner st= new Scanner(System.in);
        System.out.print("Enter a: ");
        a= st.nextFloat();
        System.out.print("Enter b: ");
        b= st.nextFloat();
        System.out.print("Enter c: ");
        c= st.nextFloat();
        System.out.println(add(a,b,c));


    }
}
