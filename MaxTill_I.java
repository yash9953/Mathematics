import java.util.Scanner;

public class MaxTill_I {
          // Print maximum element from array until i-index
          // n=7
          // a[]={1,0,2,5,4,7,8} O/p=1125578
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // initialize with a different value
                    int max=-999999999;
                    int n=sc.nextInt();
                    int a[]=new int[n];
                    for(int i=0;i<n;i++){
                              a[i]=sc.nextInt();
                    }
                    for(int i=0;i<n;i++){
                              if(i==0){
                                        System.out.print((int)a[i]+" ");
                                        max=a[i];
                                        continue;
                              }
                              else if(max<=a[i]){
                                        max=a[i];
                                        System.out.print(max+" ");
                              }
                              else{
                                        System.out.print(max+" ");
                              }
                    }
                    sc.close();
          }
}
