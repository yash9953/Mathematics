public class PrintDigit {
          public static void main(String[] args) {
                    int n = 12345;
                    int copy = n;
                    int count = 0;
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
                    //System.out.println(pow);
                    while(copy!=0){
                              System.out.println(copy/pow);
                              copy = copy % pow;
                              pow = pow /10;
                    }
          }
}
