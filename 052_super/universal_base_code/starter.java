import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Apprentice michael = new Apprentice();
		Apprentice alex = new Apprentice("CVHS", 5);
		Apprentice ilin = new Apprentice("piano", "USC", 10);
		Apprentice shawn = new Apprentice("jam", 17, "guitair", "maranatha", 10);
		
		michael.playInstrument();
		alex.practice();
		ilin.perform();
		shawn.practiceAtUniversity();


		
	}
}
