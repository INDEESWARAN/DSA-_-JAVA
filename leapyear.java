import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n= scn.nextInt();
		if(n%4==0) {
			System.out.println("Given year is leap year");
		}
		else {
			System.out.println("Given year is non-leap year");
		}
	}

}
