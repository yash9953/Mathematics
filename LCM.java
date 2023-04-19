import java.util.Scanner;

public class LCM {
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

                    //Naive solution O(a*b-min(a,b)) 
                    // int min=0,fact=1;
                    // if(a<b){
                    //           min=a;
                    // }
                    // else{
                    //           min=b;
                    // }
                    // for(int i=1;i<=min;i++){
                    //           if(a%i==0||b%i==0){
                    //                     fact*=i;
                    //           }
                    // }
                    // System.out.println(fact);
                    
                    // Best Solution O(log(min(a,b)))
                    int hcf=gcd(a, b);
                    System.out.println(a*b/hcf);
                    sc.close();
          }
}
