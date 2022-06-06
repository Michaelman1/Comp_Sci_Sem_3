package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer{
		String name;
		int age;
	public Performer(){
		name = "Michael man ";
		age = 26;
	}
	public Performer(String a, int b){
		name = a;
		age = b;
	}
	public Performer(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void practice(){
		System.out.println(name + "is practicing");
	}
	public void perform(){
		System.out.println(name + "is performing");
	}
	public String toString(){
		return("name is " + name + "and age is " + age);
	}
	public boolean equals(Object other){
		if(!(other instanceof name)){
			return false;
		}
		else{
			return this.name == other.getName();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

