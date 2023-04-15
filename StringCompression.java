import java.util.Scanner;

public class StringCompression {
          // Input: chars = ["a","a","b","b","c","c","c"]
          // Output: Return 6, and the first 6 characters of the 
          // input array should be: ["a","2","b","2","c","3"]
          // Explanation: The groups are "aa", "bb", and "ccc". 
          // This compresses to "a2b2c3".
          // count total character in new String
          static int compress(char[] chars) {
                    int c=0;
                    for(int i=0;i<chars.length-1;){
                        c++;
                        int j=i+1;
                        while(chars[j]==chars[i]&&j<chars.length-1){
                            c++;
                            j++;
                        }
                        i=j;
                    }
                    return c;
                }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // char chars[]={"a","a","b","b","c","c","c"};
                    char chars[]={'a','a','b','b','c','c','c'};
                    System.out.println(compress(chars)); 
                    sc.close();
          }
}
