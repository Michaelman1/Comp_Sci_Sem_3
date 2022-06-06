import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] arnold;
		int count = 0;
		arnold =  new int[1000];
		while(count < arnold.length){
			arnold[count] = 0;
			count = count + 1;
		}
		
		while(true){
			System.out.println(Arrays.toString(arnold));
			break;
		}
			

	}
}
