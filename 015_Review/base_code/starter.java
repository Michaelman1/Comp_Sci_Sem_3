import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		boolean strengthSize = false;

	System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
	String selection = sc.nextLine();
	
	String x = new String("Warrior");
	String y = new String("Wizard");
	String z = new String("Rogue");
	String X = new String("warrior");
	String Y = new String("wizard");
	String Z = new String("rogue");
		if(selection .equals(x)||selection .equals(X))
	{
		System.out.println("Warrior, wise choice");
	}
	
	else if(selection .equals(y)|| selection .equals(Y))
	{
		System.out.println("Wizard? Interesting");
	}
	
	 if(selection .equals(z)|| selection .equals(Z))
	{
		System.out.println("I would choose Rogue as well");
	}
	int points = 25;
	String A = new String("Strength");
	String a = new String("strength");
	String B = new String("Dexterity");
	String b = new String ("dexterity");
	String C = new String("Intelligence");
	String c = new String("intellligence");
	String D = new String("Constitution");
	String d = new String("constitution");
	String E = new String("Charisma");
	String e = new String("charisma");
	System.out.println(" You have a total of 25 points, you must choose between strength, dexterity, intelligence, constitution, and charisma for your "+ selection);
	
	System.out.println("Strength 1-10");
	int strength = sc.nextInt();
			
		if(strength > points || strength > 10)
	{
		System.out.println("Please input a lower number");
		int strength1 = sc.nextInt();
		System.out.println("Amount of points remaining = ");
		System.out.println(points - strength1);
		points = points - strength1;
	}else{
	System.out.println(" Amount of points remaining = ");
	System.out.println(points - strength);
	points = points - strength;
	}
	


	System.out.println("Dexterity 1-10");
	int dexterity = sc.nextInt();
	
	if(dexterity > points || dexterity > 10)
	{
		System.out.println("Please input a lower number");
		int dexterity1 = sc.nextInt();
		System.out.println("Amount of points remaining = ");
		System.out.println(points - dexterity1);
		points = points - dexterity1;
	}else{
	System.out.println(" Amount of points remaining = ");
	System.out.println(points - dexterity);
	points = points - dexterity;
	}
	
	System.out.println("Intelligence 1-10");
	int intelligence = sc.nextInt();

	if(intelligence > points || intelligence > 10)
	{
		System.out.println("Please input a lower number");
		int intelligence1 = sc.nextInt();
		System.out.println("Amount of points remaining = ");
		System.out.println(points - intelligence1);
		points = points - intelligence1;
	} else {
			System.out.println("  Amount of points remaining = ");
	System.out.println(points - intelligence);
	points = points - intelligence;
	}
	
	
	System.out.println("Constitution 1-10");
	int constitution = sc.nextInt();
	if( constitution > points || constitution > 10)
	{
		System.out.println("Please input a lower number");
		int constitution1 = sc.nextInt();
		System.out.println("Amount of points remaining = ");
		System.out.println(points - constitution1);
		points = points - constitution1;
	}
	
	else{
		System.out.println(" Amount of points remaining = ");
	System.out.println(points - constitution);
	points = points - constitution;
	}


	System.out.println("Charisma 1-10");
	int charisma = sc.nextInt();
	if(charisma > points || charisma >10)
	{
		System.out.println("Please input a lower number");
		int charisma1 = sc.nextInt();
		System.out.println("Amount of points remaining = ");
		System.out.println(points - charisma1);
		points = points - charisma1;
	}
	
	else{
		System.out.println("Amount of points remaining = ");
	System.out.println(points - charisma);
	points = points - charisma;
	
	System.out.print("The following number is the amount of points you have remaining: ");
	System.out.println(points);
	
	System.out.print("Congradulations, you are now a " + selection ); 
	System.out.print(" with strength at level "+ strength);
	System.out.print(", dexterity at level " + dexterity);
	System.out.print(", intelligence at level " + intelligence);
	System.out.println(", constitution at level " + constitution);
	System.out.println(", and charisma at level " + charisma);
	System.out.println("Amount of points remaining = " + points);
	//find out how to print levels of each attribute after they input one wrong
	
	}
	
	
	
	
	}
}
