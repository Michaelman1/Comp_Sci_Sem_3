import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the number you want to check");
		int value1 = sc.nextInt();
		
		if(value1%2 == 0)
		{
			System.out.println("The inputed  number  is even");
		}
		else
		{
			System.out.println("The inputed number  is odd");
		}
		
		System.out.println("Enter a number to divide by 3");
		int value2 = sc.nextInt();
		if(value2%3==0)
		{
			System.out.println("This number is divisible by 3");
		}
		else{
			System.out.println("This number isn't divisible by 3");
		}
		
		System.out.println("Next, enter a number to check with 4");
		int value3 = sc.nextInt();
		if(value3%4==0)
		{
			System.out.println("This number is divisible by 4");
		}
		else{
			System.out.println("This number isn't divisible by 4");
		}
		System.out.println("Lastly, let's check for 5");
		int value4 = sc.nextInt();
		if(value4%5==0)
		{
			System.out.println("This number is divisble by 5");
		}
		else{
			System.out.print("This number isn't divisble by 5");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
