import java.util.Scanner;

public class SecondLargest {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                  //   int n=sc.nextInt();
                  //   int arr[]=new int[n];
                  //   for(int i=0;i<n;i++){
                  //             arr[i]=sc.nextInt();
                  //   }
                  // int arr[]={1,2,3,4,5};
                  int arr[]={10,10,10,10,10};
                  int n=5;
                    int slarge=0,large=0;
                    if(arr[1]>arr[0]){
                              slarge=arr[0];
                              large=arr[1];
                    }
                    else{
                              slarge=arr[1];
                              large=arr[0];
                    }
                    for(int i=2;i<n;i++){
                           if(large<arr[i]){
                              slarge=large;
                              large=arr[i];
                              continue;
                           } 
                           if(slarge<arr[i]){
                              slarge=arr[i];
                           }  
                    }System.out.println(slarge);
                    System.out.println(large);
                    sc.close();
          }
}
