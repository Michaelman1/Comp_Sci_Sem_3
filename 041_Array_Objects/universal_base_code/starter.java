import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Warrior{
	String name;
}
class Wizard{
	String name;
	
	public Wizard(){
		
	}
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] warrior = new Warrior[100];
		Wizard[] wizard = new Wizard[100];
		for(int i = 0;i<warrior.length;i++){
			warrior[i] = new Warrior();
		}
		for(int a = 0;a<wizard.length;a++){
			wizard[a] = new Wizard();
		}
		
		
	}
}
