import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] num = new int[10];
		int max = 0;
		int min = 1000;
		int c = 0;
		while(c < num.length){
			num[c] = rand.nextInt(100);
			System.out.println(num[c] + " ");
			c = c + 1;
		}
		c = 0;
		
		System.out.println();
		while(c < num.length)
		{
			if(num[c] < min){
				min = num[c];
			}
			c = c + 1;
		}
		System.out.println("the minimum is " + min);
		
		
		System.out.println();
		while(c > num.length){
			if(num[c] > max){
				max = num[c];
			}
			c = c + 1;
		}
	System.out.println(max);
	}
}
