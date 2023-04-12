import java.util.Scanner;

public class PageNoRank {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    //int n=sc.nextInt();
                    int r=sc.nextInt();
                    int i=0;
                    int c=-1;
                    while(true){
                              c++;
                              if(r<=i){
                                        System.out.println(c);
                                        break;
                              }
                              i+=25;
                    }
                    sc.close();
          }
}
