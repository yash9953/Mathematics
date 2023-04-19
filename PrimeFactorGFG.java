import java.util.Scanner;

public class PrimeFactorGFG {
          static boolean prime(int n){
                    if(n==2||n==3){
                              return true;
                    }
                    if(n%2==0||n%3==0){
                              return false;
                    }
                    for(int i=5;i*i<=n;i=i+6){
                              if(n%i==0||n%(i+2)==0){
                                        return false;
                              }
                    }
                    return true;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    for(int i=2;i<=n;i++){
                              if(n%i==0&&prime(i)){
                                        System.out.print(i+" ");
                                        n=n/i;
                              }
                    }
                    sc.close();
          }
}
