import pkg.*;
import java.util.Scanner;
import java.util.Random;

//Combinatorics**
		 class Combinatorics{
			Random rand = new Random();
			int n = rand.nextInt(12) + 1;
			int i,fact = 1;
		public int factorial(int a){
			a = n;
			for(int i = 1;i <=n; i++){
				fact = fact*i;
				
			}
				
			return n;
		}
		public static void numCombinations(int a, int b){
			int r = b;
			int n = a;
			if(r > n){
				System.out.println(" 0 combinations");
			}
			else{
				n = (n * (n%1));
				r =  n/r(n%r);
			}
		}
			
		
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
			


		
	}
}
