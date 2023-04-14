import java.util.Scanner;

public class PrintArmstrong {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    for(int j=0;j<=n;j++){
                              int copy=j;
                              int digit=0;
                              while(copy!=0){
                                        digit++;
                                        copy=copy/10;
                              }
                              copy=j;
                              int a=0;
                              while(copy!=0){
                                        a+=Math.pow(copy%10, digit);
                                        copy=copy/10;
                              }
                              if(a==j){
                                        System.out.print(a+" ");
                              }
                    }
                    sc.close();
          }
}