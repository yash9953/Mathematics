import java.util.Scanner;

public class RevArrayDSA {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=5,m=n-1,temp=0;
                    int a[]={1,2,3,4,5};
                    for(int i=0;i<n/2;i++){
                              temp=a[m-i];
                              a[m-i]=a[i];
                              a[i]=temp;
                    }
                    for(int i=0;i<n;i++){
                              System.out.println(a[i]);
                    }
                    sc.close();
          }

}
