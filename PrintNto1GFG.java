import java.util.Scanner;

public class PrintNto1GFG {
          public static void write(int n){
		if(n==0){
			return;
		}
		write(n-1);
		System.out.print(n+" ");
	}
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
		write(n); 
                    sc.close();
          }
}
