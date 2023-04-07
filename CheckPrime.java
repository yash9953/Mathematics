import java.util.Scanner;

public class CheckPrime {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int c=0;
                    boolean a=true;
                    for(int i=2;i<n;i++){
                              // worst way to check prime n=997 o/p-> c=995
                              /*i<n/2 op->496  i*i<n op->30*/
                              // i*i<n/2 o/p->21
                              c++;
                              if(n%i==0){
                                        a=false;
                                        break;
                              }
                    }System.out.println(c);
                    if(a){
                              System.out.println("A Prime No.....");
                    }else{
                              System.out.println("Not A Prime No.....");
                    }
                    sc.close();
          }
}
