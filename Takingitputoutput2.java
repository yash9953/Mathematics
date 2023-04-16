import java.util.Scanner;

public class Takingitputoutput2 {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter name1 roll no name2");
                    String name1=sc.nextLine();
                    int rollno=sc.nextInt();
                    // used bcoz it takes \n from scanner to make name 2 working
                    sc.nextLine();
                    String name2=sc.nextLine();
                    System.out.println("Hello " +name1 +rollno  +name2);
                    sc.close();

          }
}
