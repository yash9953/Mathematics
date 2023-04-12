import java.util.Scanner;

public class Power {
          static int pow(int a,int b){
                    if(b==0){
                              return 1;
                    }
                    return a*pow(a,--b );
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    // int i=1;
                    // while(b-->0){
                    //           i*=a;
                    // }
                    // System.out.println(i);
                    System.out.println(pow(a, b));
                    sc.close();
          }
}
