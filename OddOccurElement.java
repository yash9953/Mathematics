import java.util.Scanner;

public class OddOccurElement {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int res=0;
                    // int a[]={4,3,4,4,4,5,5};
                    int a[]={8,7,7,8,8};
                    for(int i=0;i<5;i++){
                              res^=a[i];
                    }
                    System.out.println(res);
                    // int n=sc.nextInt();
                    // int a[]=new int[n];
                    // for(int i=0;i<n;i++){
                    //           a[i]=sc.nextInt();
                    // }

                    sc.close();
          }
}
