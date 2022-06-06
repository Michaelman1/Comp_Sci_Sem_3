package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {			// Default constructor!
		actor = "Tobey Maguire";
		age = 46;
		villain = "Green Goblin";
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
		public Spiderman(String a){
		this("Tobey Maguire", 46, "Green Goblin");
		}
		public Spiderman(String a, int b){
			actor = a;
			age = b;
			villain = "Green Goblin";
		}
		public Spiderman(String a, int b, String c){
			actor = a;
			age = b;
			villain = c;
		}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
		public void setActor(String a){
			actor = a;
		}
		public void setAge(int a){
			age = a;
		}
		public void setVillain(String a){
			villain = a;
		}
		public String getActor(){
			return actor;
		}
		public int getAge(){
			return age;
		}
		public String getVillain(){
			return villain;
		}
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
