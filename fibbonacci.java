import java.util.Scanner;

public class Fibbonacci {
	 public static void fibbo(int x) {
		 
		 if(x==1) {
			 System.out.println("1");  
		 }
		 else {
		
			 int a=0;
			 int b=1;
			 int c;
			 System.out.print(a+" ");
			 System.out.print(b+" ");
			 for(int i=2;i<=x;i++) {
			     c=a+b;
				 System.out.print(c+" ");
				 a=b;
				 b=c;
			 }
		 }
	 }
	
	 public static void main(String[] args){
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 fibbo(n); 

	 }
	 
	
}
