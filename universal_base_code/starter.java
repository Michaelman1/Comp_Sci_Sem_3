import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Goat{
	String name;
	int age;
	boolean trained;
	
	public Goat(){
		name = "";
		age = 0;
		boolean trained = true;
	}
	public Goat(String a, int b, boolean c){
		name = a;
		age = b;
		trained = c;
	}
	public Goat(String a){
		name = a;
	}
	public Goat(int a){
		age = a;
	}
	public Goat(boolean a){
		trained = a;
	}
	public Goat(String a, boolean b){
		name = a;
		trained = b;
	}
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void setIsTrained(boolean a){
		trained =  a;
	}
	public boolean getIsTrained(){
		return trained;
	}
	public void interact(){
		name = "jam jeez";
	}
	public void trick(){
		if(trained = true){
			System.out.println("goat does a flip");
		}
	}
	
}

class Crab{
	String name;
	int age;
	boolean trained;
	
	public Crab(){
		name = "";
		age = 0;
		trained = true;
	}
	public Crab(String a, int b, boolean c){
		name = a;
		age = b;
		trained = c;
	}
		public Crab(String a){
			name = a;
		}
		public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void setIsTrained(boolean a){
		trained = a;
	}
	public boolean getIsTrained(){
		return trained;
	}
	public void interact(){
		name = "matty ice";
	}
	public void trick(){
		if(trained = true){
			System.out.println("crab does gav walk");
		}
	}
	
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Goat goat = new Goat();
		Goat goat2 = new Goat(25);
		Goat goat3 = new Goat(true);
		Goat michael = new Goat("michael");
		Goat bris = new Goat("bris", true);
		Goat nicole = new Goat("nicole", 17, false);
		
		Crab gav = new Crab("gav", 15, true);
		Crab chris = new Crab("chris");
		
		
		
		System.out.println();
		michael.trick();
		bris.trick();
		nicole.trick();
		gav.trick();
		chris.trick();


		
	}
}
