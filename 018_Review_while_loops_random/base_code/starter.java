import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Try to guess the number I'm thinking of from 1 to 1,000");
		int guess = sc.nextInt();
		int secret = rand.nextInt(1000) + 1;
		
	while(guess != secret)
	{
		System.out.println("Guess again");
		guess = sc.nextInt();
		if(guess == secret){
			break;
		}
	
	}
		System.out.println("Good job!");


		
	}
}
