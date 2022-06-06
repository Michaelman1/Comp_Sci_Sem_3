import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getArrayMin(int [] num){
		int min = 1000;
		int c = 0;
			while(c < num.length)
		{
			if(num[c] < min){
				min = num[c];
			}
			c = c + 1;
		}
		System.out.println("the minimum is " + min);
		return min;
		}
		
		public static int getArrayMax(int [] num){
		int max = 0;
		int c = 0;
			while(c < num.length){
				if(num[c] > max){
					max = num[c];
				}
				c = c + 1;
			}
				System.out.println("the maximum is " + max);
					return max;
		}
		
		
		public static void toStringArray(int [] num){
			for(int c = 0; c < num.length; c++){
				
			}
		System.out.println();
			
		}
		
		public static int getArrayAverage(int[] num){
			int arr[] = new int[100];
			int sum = 0;
			for(int c = 0; c < arr.length; c++){
				sum = sum + arr[c];
			
			}
				System.out.println("the average is " + sum);
			return sum;
		}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		Random rand = new Random();
		int[] num = new int[10];
		int max = 0;
		int min = 1000;
		int c = 0;
		int[] arr = new int[100];
		while(c < arr.length){
			arr[c] = rand.nextInt(100) + 1;
			
			c++;
		}
	
		getArrayMax(arr);
		getArrayMin(arr);
		getArrayAverage(arr);
		toStringArray(arr);
	}
}
