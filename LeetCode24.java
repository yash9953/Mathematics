import java.util.Scanner;

public class LeetCode24 {
          static int removeElement(int[] nums, int val) {
                    int c=0;
                    int k=nums.length;
                    for(int i=0;i<k;i++){
                        if(nums[i]==val){
                            c++;
                        }
                    }
                    return k-c;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int nums[]={0,1,2,2,3,0,4,2};
                    System.out.println(removeElement(nums, 2));
                    sc.close();
          }
}
