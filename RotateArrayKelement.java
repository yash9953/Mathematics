public class RotateArrayKelement {
          // Rotate Array by k=1
          public static void main(String[] args) {
                    int a[]={1,2,3,4,5,6,7};
                    int n=a.length;
                    int temp=a[0];
                    for(int i=0;i<n-1;i++){
                              a[i]=a[i+1];
                    }
                    a[n-1]=temp;
                    for(int i=0;i<n;i++){
                              System.out.print(a[i]+" ");
                    }
          }
}
