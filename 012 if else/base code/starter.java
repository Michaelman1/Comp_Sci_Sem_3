import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();  
		int x = rand.nextInt(1001); 
		
			int answer;
		
		System.out.println("Guess a number between 1 and 1,000");
		answer = sc.nextInt();
		if (answer ==x)
		{
				System.out.println("That is correct!");
		}
			else 
			{
				System.out.println("That is incorrect, the correct answer is " x);
			}
		
	
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
