import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Actor{
	String type;
	
	public Actor(){
	type = "theater";
	}
	public void practice(){
		System.out.println("not practicing anymore");
	}
	public void perform(){
		System.out.println("I suck at performing");
	}
	public void monologue(){
		System.out.println("You're not going to die because you're feeling a little bit of pain");
	}
	

	
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Actor michael = new Actor();
		michael.practice();
		michael.perform();
		michael.monologue();


		
	}
}
