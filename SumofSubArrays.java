import java.util.Scanner;

public class SumofSubArrays {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // int n=sc.nextInt();
                    // int a[]=new int[n];
                    // for(int i=0;i<n;i++){
                    //           a[i]=sc.nextInt();
                    // }
                    int n=3;
                    int a[]={1,2,3};
                    for(int i=0;i<n;i++){
                              // int sum=0;
                              for(int j=i;j<n;j++){
                                        // sum+=a[j];
                                        for(int k=i;k<j;k++){
                                            System.out.print(a[k]+" ");      
                                        }
                                        // System.out.println();
                              }
                              // System.out.print(sum+" ");
                              // System.out.println();
                              // System.out.print(a[i]);
                              // System.out.println();
                    } 
                    sc.close();
          }
}
