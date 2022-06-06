package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
		String instrument;
		String name;
		int age;
	
	public Musician(){
		instrument = "Chello";
	}
	public Musician(String a){
		instrument = a;
	}
	public Musician(String a, String b){
		name = a;
		instrument = a;
	}
	public Musician(String a, int b, String c){
		name = a;
		age = b;
		instrument = c;
	}
	public String getInstrument(){
		return instrument;
	}
	public void playInstrument(){
		System.out.println(instrument + "is played");
	}
	public String toString(){
		System.out.println(name + instrument);
	}


	
	
	
	
	
	
	
	
	
}







