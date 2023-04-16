import java.io.IOException;
import java.util.Scanner;

public class Takinginputoutput{
          public static void main(String[] args) throws IOException{
                    // IOException used to throw exception at runtime itself
                    // by JVM of JRE
                    System.out.println("Enter your name");
                    Scanner sc=new Scanner(System.in);
                    String name=sc.nextLine();
                    System.out.println("Hi -->" +name);
                    sc.close();
                    // int a=System.in.read();
                    // reads only one character at a time
                    // it will return ASCII value of the character
                    
          }
}