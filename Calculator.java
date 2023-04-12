public class Calculator {
          public static void main(String[] args) {
                    int n1=Integer.parseInt(args[0]);
                    int n2=Integer.parseInt(args[2]);
                    String opr=args[1];
                    if(opr.equals("+")){
                              System.out.println("Sum="+(n1+n2));
                    }
                    else if(opr.equals("X")){
                              System.out.println("Multiplicating="+(n1*n2));
                    }
                    else if(opr.equals("/")){
                              System.out.println("Division="+(n1/n2));
                    }
                    else if(opr.equals("-")){
                              System.out.println("Subtraction=" +(n1-n2));
                    }
          }
}
