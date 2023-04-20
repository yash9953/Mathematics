import java.util.Scanner;

public class TraillingZero {
          // upto n=19 otherwise overflow
          // static int fact(int n){
          //           if(n==0){
          //                     return 1;
          //           }
          //           return n*fact(n-1);
          // }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    // int num=fact(n);
                    // System.out.println(num);
                    // int c=0;
                    // while(num!=0){
                    //           if(num%10==0){
                    //                     c++;
                    //           }
                    //           num=num/10;
                    // }
                    // System.out.println("Trailling Zero's"+c);

                    int res=0;
                    for(int i=5;i<=n;i=i*5){
                              res=res+n/i;
                    }
                    System.out.println("Trailling zero's are="+res);
                    sc.close();
          }
}
