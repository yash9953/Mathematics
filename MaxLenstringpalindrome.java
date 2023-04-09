import java.util.Scanner;

public class MaxLenstringpalindrome {
          // to find max length palindrome string from the i/p string
          static boolean check(String str,String s,int n){
                    if(n<0&&str.equals(s)){
                              return true;
                    }
                    else if(n<0){
                              return false;
                    }
                    s+=str.charAt(n);
                    return check(str, s, --n);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.next();
                    String s="",res="";
                    int n=str.length();
                    for(int i=0;i<n;i++){
                              for(int j=n;j>=i;j--){
                                        s=str.substring(i, j);
                                        if(check(s,"",s.length()-1)){
                                                  // to get palindromic string
                                                  // System.out.print(s+" ");
                                                  if(res.length()<s.length()){
                                                            res=s;
                                                  }
                                                  // break;
                                        }
                              }
                    }
                    System.out.println(res);
                    sc.close();
          }
}
