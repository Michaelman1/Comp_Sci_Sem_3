import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii one = new Ascii("Human");
		Ascii two = new Ascii("Dog", 3);
		Ascii three = new Ascii("Cactus", "bill");
		Ascii four = new Ascii("Human","cat",  5);
		Ascii five = new Ascii("Blob", "mike");
		
		one.printArt();
		two.printArt();
		three.printArt();
		four.printArt();
		five.printArt();
		

		
	}
}
