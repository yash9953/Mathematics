import java.util.List;

public class FindIndexString {
          static int strStr(String haystack, String needle) {
                    int j=0,c=0;
                    for(int i=0;i<haystack.length();i++){
                        if(haystack.charAt(i)==needle.charAt(j)){
                            if(j==0){
                                c=i;
                            }
                            if(j==needle.length()-1){
                                return c;
                            }
                            j++;
                            continue;
                        }
                        else{
                           j=0; 
                        }
                    }
                    return -1;
          }
          public static void main(String[] args) {
                    String needle="mississippi",haystack="issip";
                    System.out.println(strStr(haystack, needle));
          }
}
