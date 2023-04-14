import java.util.Scanner;

public class PrimeNumber {
     // Print prime numbers upto entered range n
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();

          // Using Sieve of Eratosthenes O()
          

          // O(n^2)
          for(int i=2;i<=n;i++){
                    for(int j=2;j<=n;j++){
                              if(i%j==0&&i==j){
                                        System.out.println(i);
                                        break;
                              }else if(i%j==0&&i!=j){
                                        break;
                              }
                    }
          }
          sc.close();
     }     
}
