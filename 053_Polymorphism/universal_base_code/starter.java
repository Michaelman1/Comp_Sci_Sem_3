import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer[] performers = new Performer[4];
		performers[0] = new Performer();
		performers[1] = new Musician();
		performers[2] = new Apprentice();
		performers[3] = new Actor();
		
		performers[0].perform();
		performers[0].practice();
		performers[1].perform();
		((Performer)performers[1]).practice();
		((Apprentice)performers[2]).practiceAtUniversity();
		((Musician)performers[2]).playInstrument();
		((Actor)performers[3]).monologue();
		((Performer)performers[3]).perform();


		
	}
}
