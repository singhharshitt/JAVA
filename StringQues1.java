import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringQues1{

    public static void main(String[] args) {
       
        Scanner st= new Scanner(System.in);
        int l=1;
        while(st.hasNext()){
            String line= st.nextLine();
            System.out.println(l +" "+line);
            l++;
        }
    }
}
