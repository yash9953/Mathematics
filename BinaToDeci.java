import java.util.Scanner;

public class BinaToDeci {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Binary Number");
                    int n=sc.nextInt();
                    int copy=n;
                    int decinumber=0;
                    int count=0;
                    while(n!=0){
                              n=n/10;
                              count++;
                    }
                    // System.out.println(count);
                    for(int i=0;i<count;i++){
                              int rem=copy%10;
                              decinumber+=rem*Math.pow(2,i);
                              copy=copy/10;
                              if(copy==0){
                                        System.out.println(decinumber);
                                        break;
                              }
                    }
                    sc.close();
          }
}
