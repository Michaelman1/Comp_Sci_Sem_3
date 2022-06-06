import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter{
	public static void main(String args[]) {
		// Your code goes below here
		Performer performer = new Performer();
		Performer mike = new Performer("mike", 17);
		Musician musician = new Musician();
		Musician alex = new Musician("Alex");
		performer.getName();
		performer.practice();
		mike.getName();
		mike.perform();
		musician.getName();
		musician.perform();
		musician.playInstrument();
		musician.practice();
		musician.getInstrument();
		

		
	}


}
	
	
