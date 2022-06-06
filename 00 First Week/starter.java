
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
	
		System.out.println("Welcome to the digital slot machine! You start with 100 dollars.");
		System.out.println("If two of the numbers rolled are the same, you will double your money. The same concept applies if all 3 match!");
		System.out.println("If none of the numbers rolled are the same, you lose the money bet. But don't be scared to try again!");
		
		System.out.println("Enter yes if you want to play, no if not.");
		String choice = sc.nextLine();
		
		String x =new String("yes");
		String X = new String("Yes");
		String Y = new String("Y");
		String y = new String("y");
		
		String No = new String("No");
		String no = new String("no");
		String N = new String("N");
		String n =new String("n");
		
		
		if( choice .equals(x) || choice .equals(X) || choice .equals(Y) || choice .equals(y))
		{
			System.out.println("Great, let's get started");
		}
		
		if( choice .equals(No) || choice .equals(no) || choice .equals(N) || choice .equals(n))
		{
			System.out.println("run the lab again if you change your mind.");
			System.exit(10);
		}
		do{
		System.out.println("how much money would you like to wager?");
		int wager = sc.nextInt();
		int dollars = 100;
		
		//System.out.print("Amount of money left = $");
		//System.out.println(dollars - wager);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int slotnumber1 = rand.nextInt(10) + 1;
		int slotnumber2 = rand.nextInt(10) + 1;
		int slotnumber3 = rand.nextInt(10) + 1;
		System.out.println(slotnumber1);
		System.out.println(slotnumber2);
		System.out.println(slotnumber3);
		//System.out.print("Amount of money left = $");
		//System.out.println(dollars - wager);
		
			dollars = dollars - wager;
		if(slotnumber1 == slotnumber2 || slotnumber2 == slotnumber3 || slotnumber1 == slotnumber3)
		{
			System.out.print("You now have $");
			System.out.println(wager + dollars);
			
		}
		  if(slotnumber1 != slotnumber2 || slotnumber2 != slotnumber3 || slotnumber1 != slotnumber3)
		{
		 System.out.print("Amount of money left = $");
		System.out.println( dollars - wager);
		dollars = dollars - wager;
		
		}
		  if(wager > dollars || wager < 1)
		{
			System.out.println("Please input a lower number ");
			int wager1 = sc.nextInt();
			System.out.print("money left = $");
			System.out.println(dollars - wager1);
		}
		if(dollars == 0 || dollars < 0)
		{
			System.exit(0);
		}
	}while(true);
		
	
		
	
	
	
		
	
	
	
		}
	
		
	}
