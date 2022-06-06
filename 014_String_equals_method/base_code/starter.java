import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Would you like to be a Wizard, Warrior, or a Rogue.");
	String selection = sc.nextLine();
	
	String x = new String("Warrior");
	String y = new String("Wizard");
	String z = new String("Rogue");
	String X = new String("warrior");
	String Y = new String("wizard");
	String Z = new String("rogue");
	if(selection .equals(x)||selection .equals(X))
	{
		System.out.print("Warrior, wise choice");
	}
	
	else if(selection .equals(y)|| selection .equals(Y))
	{
		System.out.println("Wizard? Interesting");
	}
	
	 if(selection .equals(z)|| selection .equals(Z))
	{
		System.out.println("I would choose Rogue as well");
	}
	
	
	
	
	}
}
