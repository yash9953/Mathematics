import java.util.Scanner;

public class CheckPalindrome {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int copy=n;
                    int sum=0;
                    while(n!=0){
                              int b=n%10;
                              sum=sum*10+b;
                              n=n/10;
                    }
                    if(sum==copy){
                              System.out.println("Palindrome Number");
                    }else{
                              System.out.println("Not a Palindrome");
                    }
                    sc.close();
          }
}
