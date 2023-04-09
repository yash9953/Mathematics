import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceUsingLoop {
          // i/p="yash"
          // [, yash, y, ya, yas, yah, ys, ysh, yh, a, as, ash, ah, s, sh, h]
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String str=sc.nextLine();
                    // subsequence(str,0,"");
                    ArrayList<String> list=new ArrayList<>();
                    list.add("");
                    list.add(str);
                    for(int i=0;i<str.length();i++){
                              list.add(""+str.charAt(i));
                              for(int j=i+1;j<str.length();j++){
                                        list.add(""+str.charAt(i)+str.charAt(j));
                                        for(int k=j+1;k<str.length();k++){
                                                  list.add(""+str.charAt(i)+str.charAt(j)+str.charAt(k));
                                        }
                              }
                    }
                    System.out.println(list); 
                    sc.close();
          }
}
