import java.util.Scanner;

public class PowOf2GFG {
          // to check it is in power of 2 n&(n-1)==0 if(n==ONLy pow of 2)
          static int pow(int n,int c){
                    if(n==0){
                              return c;
                    }
                    if(n%2!=0&&n!=1){
                              return c;
                    }
                    return pow(n/2, ++c);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int c=pow(n,0);
                    System.out.println("No's of 2's "+--c);
                    sc.close();
          }
}
