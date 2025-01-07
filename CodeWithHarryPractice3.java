//q1

import java.util.Scanner;
//Program to convert String to lower case

    
public class CodeWithHarryPractice3{
   public static void main(String[] arg){
       Scanner st= new Scanner(System.in);
       System.out.print("Enter a string : ");
       String str= st.nextLine();
       System.out.println("Entered String: "+ str);
       System.out.println("In lower case: "+str.toLowerCase());
   }
}

//q2

//Program to replace extra front and rear spaces

public class  CodeWithHarryPractice3{
   public static void main(String[] arg){
       Scanner st= new Scanner(System.in);
       String str2= st.nextLine();
       System.out.println("String: "+str2);
       System.out.println("After removing extra Spaces: "+str2.trim());
   }
}


//q3

//Fill the given letter template

public class  CodeWithHarryPractice3{
   public static void main(String[] arg){
       Scanner st= new Scanner(System.in);
       String letter= "Dear <|name|>, Thanks a lot.";
       String name=st.nextLine();
       System.out.println(letter);
       System.out.println("After Replacing: "+ letter.replace("<|name|>",name));
   }
}

//

//Q4

//Detecting double and triple space in a string

public class CodeWithHarryPractice3{
   public static void main(String[] arg){
       Scanner st= new Scanner(System.in);
       System.out.print("Enter a String: ");
       String str= st.nextLine();
       System.out.println("Is String contains Double Space: "+ str.contains("  "));
       System.out.println("Is String contains Triple Spaces: "+ str.contains("   "));

   }
}




//Q5

//Program to formate the letter using escape sequence

public class CodeWithHarryPractice3{
   public static void main(String[] arg){
       System.out.format("Dear Harry,\n\t\tThis Java Course is Nice.\nTHANKS");
   }
}
