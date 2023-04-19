import java.util.Scanner;

public class PrintIndex {
          // Print Index where it occur in array else where it is fit best
          // int arr[]={1,3,5,6};
          // I/P a=5 O/P=2
          // I/P a=2 O/P=1 I/P a=7 O/P=4
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int[n];
                    for(int i=0;i<n;i++){
                              arr[i]=sc.nextInt();
                    }
                    int a=sc.nextInt();
                    // int arr[]={1,3,5,6};
                    int c=0,k=0;
                    for(int i=0;i<arr.length;i++){
                              if(a==arr[i]){
                                        c=1;
                                        System.out.print(i);
                                        break;
                              }
                              if(c!=1){
                                        if(a>arr[i]){
                                                  k=i;
                                        }
                              }
                    }
                    if(c!=1){
                              System.out.print(k+1);
                    }
                    sc.close();
          }
}
