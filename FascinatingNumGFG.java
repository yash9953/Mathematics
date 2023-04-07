import java.util.Scanner;

public class FascinatingNumGFG {
          boolean fascinating(long n) {
                    // code here
                    String a=""+n*2;
                    String b=""+n*3;
                    String c=""+n;
                    String str=""+c+a+b;
                    for(int i=0;i<str.length();i++){
                              // if(str.charAt(i)=='0'){
                              //           return false;
                              // }
                        for(int j=i+1;j<str.length();j++){
                            if(str.charAt(i)==str.charAt(j)||str.charAt(i)=='0'){
                                return false;
                            }
                        }
                    }     
                    return true;
                }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    long n=sc.nextLong();
                    String a=""+n*2;
                    String b=""+n*3;
                    String c=""+n;
                    String str=""+c+a+b;
                    System.out.println(str);
                    int d=0;
                    for(int i=0;i<str.length();i++){
                        for(int j=i+1;j<str.length();j++){
                            if(str.charAt(i)==str.charAt(j)||str.charAt(i)=='0'){
                                System.out.println("Not a fascinating number");
                                d=1;
                                break;
                            }
                        }
                        if(d!=0){
                              break;
                        }
                        else if(i==str.length()-1){
                              System.out.println("yes");
                        }
                    }
                    sc.close();
          }
}
