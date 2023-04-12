import java.util.ArrayList;
import java.util.Scanner;

public class PartyOfCoupleGFG {
          // we can solve it also using bitwise-xor operation
        //   general for all k-times occurence of other's elements
          static ArrayList<Integer> findSingle(int N, int arr[]){
                    ArrayList<Integer> list=new ArrayList<>();
                    for(int i=0;i<N;i++){
                        int k=arr[i];
                        if(isuniq(arr,k,0,i,N)){
                            list.add(k);
                        }
                    }
                    return list;
                }
                static boolean isuniq(int arr[],int k,int i,int j,int n){
                    if(i==n){
                        return true;
                    }
                    if(i!=j){
                        if(arr[i]==k){
                            return false;
                        }
                    }
                    return isuniq(arr,k,++i,j, n);
                }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int N=sc.nextInt();
                    int arr[]=new int[N];
                    for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                    }
                    System.out.println(findSingle(N,arr));
                    sc.close();
          }
}
