import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("First Number = ");
	int one = sc.nextInt();
	
	System.out.println("Second Number = ");
	int two = sc.nextInt();
	
	System.out.println("Third Number = ");
	int three = sc.nextInt();
	
	if (one > two) {
		int four;
		four = 0;
		four += one;
		if( four > three) {
			System.out.println("The first number is the biggest");
		} else {
		 	System.out.println("The third number is the biggest");
		 	System.out.println("The first number is smallest");
		 	
		 }
		 
		 if(two < three) {
		 	System.out.println("The second number is the smallest");
		 	System.out.println("The first number is biggest");
		 }  else {
		 	System.out.println("The third number is the smallest");
		 }
	} else {
		int five;	
		five = 0;
		five += two;
		if ( five > three)  {
			System.out.println("The second number is biggest");
			System.out.println("The first number is smallest");
		} else {
			System.out.println("The third number is the biggest");
			
			
		}
	}
		
		 
		 }





	
	
	
	
	
	
	
	
	}

