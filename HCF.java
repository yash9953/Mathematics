import java.util.Scanner;

public class HCF {
          // recursvie~ Best method O()
          static int gcd(int a,int b){
                    if(b==0){
                              return a;
                    }
                    return gcd(b, a%b);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("HCF of "+a+" and "+b+" is "+gcd(a, b));
                    sc.close();
          }
}
