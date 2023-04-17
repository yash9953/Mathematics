import java.util.Scanner;

public class ReverseString {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    String str2="";
                    for(int i=0;i<str.length();i++){
                              str2+=str.charAt(str.length()-i-1);
                    }System.out.println(str2);
                    sc.close();
          }
}
