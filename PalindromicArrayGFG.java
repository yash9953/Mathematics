import java.util.Scanner;

public class PalindromicArrayGFG {
          public static int palinArray(int[] a, int n){
                    for(int idx=0;idx<n;idx++){
                        int b=a[idx];
                        if(check(b,b,"")){
                            continue;
                        }
                        else{
                            return 0;
                        }
                    }System.out.println(1);
                    return 1;
             }
          public static boolean check(int b,int copy,String c){
              if(b==0){
                  if(Integer.parseInt(c)==copy){
                      return true;
                  }
                  return false;
              }
              c+=b%10;
              return check(b/10,copy,c);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int a[]=new int[n];
                    for(int i=0;i<n;i++){
                              a[i]=sc.nextInt();
                    }
                    palinArray(a, n);
                    sc.close();
          }
}
