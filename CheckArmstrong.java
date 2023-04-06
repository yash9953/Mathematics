import java.util.Scanner;

public class CheckArmstrong {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int sum=0;
                    int b=n;
                    
                    while(n!=0){
                              int a=n%10;
                              n=n/10;
                              sum+=a*a*a;
                    }
                    if(b==sum){
                              System.out.println("Armstrong Number");
                    }else{
                              System.out.println("Not An Armstrong number");
                    }
                    sc.close();
          }
}
