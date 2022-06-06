import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	 
	
	Scanner sc = new Scanner(System.in);


	System.out.println("What is your name?");
	String name = sc.nextLine();
	
	System.out.println("What is your age?");
	String age = sc.nextLine();

	System.out.println("What is your birthday month?");
	int month = sc.nextInt();

	System.out.println("What is day of the month are you born?");
	int day = sc.nextInt();

	System.out.println("What year were you born?");
	int year = sc.nextInt();
	
	System.out.println("How much is a buck fifty?");
	int buckfifty = sc.nextInt();
	
	System.out.println("Your name is " + name);
	
	System.out.println("You are " + age);
	
	System.out.println("Your birthday month is " + month);
	
	System.out.println("Your are born on the " + day);
	
	System.out.println("You were born in " + year);
	
	System.out.println("A buck fifty is " + buckfifty);


	}
}
