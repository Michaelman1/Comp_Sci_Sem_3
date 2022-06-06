import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word, any word");
		String word = sc.nextLine();
		
		int x = 0;
		while(x < word.length()){
			System.out.print(word.substring(x,x+1));
			x++;
		}
		
		int y = 0;
		while(y < word.length()){
			System.out.println(word.substring(y,y+1));
			y++;
		}
		
		
	}
}
