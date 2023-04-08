import java.util.Scanner;

public class LeetCode944 {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // String str[]={"cba","daf","ghi"};
                    String str[]={"b","a","c"};
                    // "zyx","wvu","tsr"
                    // String str[]={"egguij","gjsnnk","lstgon","ztzrqv"};
                    // String str[]={"ad","cb","ef"};
                    int c=0;
                    if(str.length==str[0].length()){
                              for(int i=0;i<str.length;i++){
                                        for(int j=0;j<str.length-1;j++){
                                                  char m=str[j].charAt(i);
                                                  char n=str[j+1].charAt(i);
                                                  // int a=m-'0';
                                                  // int b=str.charAt(i)-'0';
                                                  if(m>n){
                                                            c++;
                                                            break;
                                                  }
                                        }
                              }
                    }
                    else{
                                        for(int j=0;j<str[0].length();j++){
                                                  for(int i=0;i<str.length-1;i++){
                                                            char m=str[i].charAt(j);
                                                            char n=str[i+1].charAt(j);
                                                            if(m>n){
                                                                      c++;
                                                                      break;
                                                            }
                                                  }
                                        }
                               
                    }
                    System.out.println(c);
                    sc.close();
          }
}
