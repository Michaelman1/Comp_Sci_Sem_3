import java.util.Scanner;
import java.util.Random;

	 class character{
	String role = "wizard";
	int strength = 5;
	int dexterity = 10;
	int intelligence = 1;
	int constitution = 3;
	int charisma = 6;

}


	 class starter{
	
	public static void main(String args[]){
		
		character John = new character();
		System.out.println(John.strength);
		System.out.println(John.dexterity);
		System.out.println(John.intelligence);
		System.out.println(John.constitution);
		System.out.println(John.charisma);
	}
}
