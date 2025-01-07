import java.util.Scanner;
public class EncryptAndDecrypt{
    public static void main(String[] arg){
        char grade;
        Scanner st= new Scanner(System.in);
        System.out.print("Enter grade: ");
        grade= st.next().charAt(0);
        System.out.println("Encoding the grade by adding 8");
        int enc=grade + 8;
        System.out.println("Encrypted grade: "+(char) enc);
        int dec= enc - 8;
        System.out.println("Decrypted grade: "+(char) dec);
    }

}
