package pkg;
import java.util.Scanner;
import java.util.Random;

public class Actor extends Performer{
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