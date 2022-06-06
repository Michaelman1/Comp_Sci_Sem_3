import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 500);
		printValuesInt(arr1);
		bubbleSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);


		
	}
	
	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void bubbleSort(int arr[], int n){
		
		int i, j;
		for(i = 0; i < n -1; i++){
			for(j = 0; j < n -i -1; j++){
				if(arr[j] > arr[j + 1]){
					swap(arr[j], arr[j + 1]);
				}
			}
		}
	}

	
	
	
}
