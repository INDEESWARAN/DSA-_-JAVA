import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n= scn.nextInt();
	int count =0;
    for(int i =1;i<=n;i++) {
    	if(n%i==0) {
    		count++;
    	}
    }
    if(count==0) {
		System.out.println("The number is a prime");
	}
	else {
		System.out.println("The number is not a prime");
	}

    		
    	}
    

}

