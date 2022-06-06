package pkg;
import java.util.Scanner;
import java.util.Random;

public class Apprentice extends Musician{
	String school;
	int yearsOfExperience;
	
	public Apprentice(){
		school = "CVHS";
		yearsOfExperience = 0;
	}
	public Apprentice(String a, int b){
		school  = a;
		yearsOfExperience = b;
	}
	public Apprentice(String a, String b, int c){
		instrument = a;
		school = b;
		yearsOfExperience = c;
	}
	public Apprentice(String a, int b, String c, String d, int e){
		name = a;
		age = b;
		instrument = c;
		school = d;
		yearsOfExperience = e;
	}
	public void playInstrument(){
		System.out.println(instrument + " is played");
	}
	public void practice(){
		System.out.println(yearsOfExperience + " is how many years we have been practicing");
	}
	public void perform(){
		System.out.println(name +  " performs poorly");
	}
	public void practiceAtUniversity(){
		System.out.println(yearsOfExperience + "is how many years we have been practicing at " + school);
	}
	
	


}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	

		
	}
}
