//Program to use Static Keyword 


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStatic {
static int B;
    static int H;
    static boolean flag = true;

    // Static block to initialize static variables
    static {
        Scanner st = new Scanner(System.in);
        B = st.nextInt();
        H = st.nextInt();
        
        // Validation for positive values
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

 
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of clas
