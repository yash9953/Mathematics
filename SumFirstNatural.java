import java.util.Scanner;

public class SumFirstNatural {
          // sum of first natural upto range n
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int sum=0;
                    // 1st method using loop O(n)
                    for(int i=1;i<=n;i++){
                              sum+=i;
                    }
                    
                    // // 2nd method using formula O(1)
                    // sum=n*(n+1)/2;
                    System.out.println(sum);
                    sc.close();
          }
}
