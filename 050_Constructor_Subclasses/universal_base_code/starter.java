import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter{
	public static void main(String args[]){
		// Your code goes below here
		Musician mike = new Musician("Mike", "Guitair");
		mike.getName();
		mike.practice();
		mike.getInstrument();
		Musician alex = new Musician("Alex", 15, "Chello");
		alex.getName();
		alex.perform();
		alex.playInstrument();
		


		
	}
}
