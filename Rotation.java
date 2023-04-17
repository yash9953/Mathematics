import java.util.Scanner;

public class Rotation {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n = sc.nextInt();
                    int r=sc.nextInt();
                    int copy2=n;
                    int count = 0;
                    // Step - 1 Count the Digit
                    while(n!=0){
                              n = n/10;
                              count++;
                    }
                    r=count-r;
                    int b=r;
                    // Step-2 Compute the Power
                    int pow = 1;
                    while(count>1){
                              pow = pow * 10;
                              count--;
                    }
                    int pow2=1;
                    while(b!=0){
                            pow2=pow2*10;
                            b--;
                    }
                    int count3=0;
                    int a=0;
                    //rotate number
                    while(copy2!=0){
                              count3++;
                              if(count3>r){
                                     a=a+copy2*pow2;
                                     pow2=pow2/10;
                                     System.out.println(a);
                                     break;   
                              }else{
                                     a=a*10+copy2/pow;
                                     copy2=copy2%pow;
                                     pow=pow/10;   
                              }
                    }
                    sc.close();

          }
}
