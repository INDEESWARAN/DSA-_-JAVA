import java.util.Scanner;

public class Num_Rev {

	public static void main(String[] args) {
		int n=480;
		int rem=0,rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;//System.out.print(rem) for printing including zero;
			n=n/10;
		}
		System.out.println(rev);
		

	}                                      

}  
