import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int temp=n;
        int num=temp;
        int count =0;
		while(temp>0) {
		count++;
		temp=temp/10;
		}
		int sum=0; 
		while(num>0) {
			int rem=num%10;
			sum= sum +(int) Math.pow(rem, count);
			num=num/10;
		}
	
		if(sum==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong ");
		}
	}

}
