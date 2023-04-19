import java.util.Scanner;

public class AllDivisors {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int res=2;
                    while(n%res==0){
                              System.out.print(res+" ");
                              res*=2;
                    }
                    res=3;
                    while(n%res==0){
                              System.out.print(res+" ");
                              res*=3;
                    }
                    res=6;
                    while(n%res==0){
                              System.out.print(res+" ");
                              res*=2;
                    }
                    for(int i=5;i*i<=n;i+=6){
                              if(n%i==0){
                                        System.out.print(i+" ");
                              }
                              if(n%(i+2)==0){
                                        System.out.print(i+2+" ");
                              }
                    }


                    // Θ(n)
                    // for(int i=1;i<=n;i++){
                    //           if(n%i==0){
                    //                     System.out.print(i+" ");
                    //           }
                    // }
                    sc.close();
          }
}
