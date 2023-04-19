import java.util.Scanner;

public class CheckKthBit {
          // O(2^(k-1))
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int k=sc.nextInt();
                    int a=1;
                    a=a<<k-1;
                    int m=n&a;
                    if(m>0){
                              System.err.println("Yes "+k+"th Bit is set in "+n);
                    }
                    else{
                              System.out.println("No");
                    }
                    sc.close();
          }
}
