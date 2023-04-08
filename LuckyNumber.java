public class LuckyNumber {
     public static void main(String[] args) {
          int n = 72478;
          // Count the Digit
          int count = 0;
          int copy = n;
                    // Step - 1 Count the Digit
                    while(n!=0){
                              n = n/10;
                              count++;
                    }
                     // Step-2 Compute the Power
                     int pow = 1;
                     while(count>1){
                               pow = pow * 10;
                               count--;
                     }
                     // Step-3 Find the Even Places
                     count = 0;
                     int sum = 0;
                     while(copy!=0){
                              int val = copy / pow;
                              copy = copy % pow;
                              count++;
                              if(count%2==0){
                                  sum = sum+val;                
                              }
                              pow = pow /10;
                     }
                     System.out.println(sum%9==0?"Lucky Number":"Not a Lucky Number");
     }     
}
