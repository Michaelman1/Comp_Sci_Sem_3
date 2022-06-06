import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		Random rand = new Random();
		int x = rand.nextInt(100) + 1;
		int y = 0;
		while(y < 100){
			System.out.println(x);
			y++;
		}
	
	}
	
	}
