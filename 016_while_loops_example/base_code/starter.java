import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a name.");
		String name = sc.nextLine();
		
		System.out.println("Next, input how many times you want to print this name");
		int amount = sc.nextInt();
	
		int amount2 = 0;
	while(true)
	{
		System.out.println(name);
		if( amount2 == amount-1) {
			break;
		}
			amount2 = amount2 +1;
		
	}	
	
		
		
		
	}
}
