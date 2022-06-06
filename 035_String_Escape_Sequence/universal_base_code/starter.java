import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your favorite food?");
		String user = sc.nextLine();
		System.out.println(user + "? \\ Gross");
		
		System.out.println("Who's your favorite rapper");
		String n = sc.nextLine();
		System.out.println(n + " sucks \\ pop smoke is #1");
		
		

		
	}
}
