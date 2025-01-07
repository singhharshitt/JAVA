//CWH Q1
//Code for calculatingb percentages of 5 subjects
import java.util.Scanner;

public class Restart1 {
    public static double calc(int[] arr){
        int sum=0;
        for(int i=0; i<5; i++){
            sum+= arr[i];
        }
        return (double) sum /5;
    }
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5;
        System.out.print("Enter English marks: ");
        sub1 = st.nextInt();
        System.out.print("Enter Maths marks: ");
        sub2 = st.nextInt();
        System.out.print("Enter Computer Science marks: ");
        sub3 = st.nextInt();
        System.out.print("Enter Science marks: ");
        sub4 = st.nextInt();
        System.out.print("Enter Social Studies marks: ");
        sub5 = st.nextInt();
        st.nextLine();
        String name;
        System.out.print("Enter the Student Name: ");
        name= st.nextLine();
        System.out.println("Calculating the Percentage of Student");
        int[] arr={sub1, sub2, sub3, sub4, sub5};
        double result = calc(arr);
        System.out.printf("%s got %.2f",name, result);
        System.out.println("% in the boards.");


    }
}
