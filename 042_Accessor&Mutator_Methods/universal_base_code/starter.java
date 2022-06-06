import pkg.*;
import java.util.Scanner;
import java.util.Random;


 class Dwarf{
	String name;
	int age;
	
	public Dwarf(){
		name = "";
		age = 0;
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

 }
 class starter{
	public static void main(String args[]){
		Random rand = new Random();
		Dwarf[] dwarf = new Dwarf[100];
		String[] names = {"Grumpy", "Dopey","Doc","Happy","Bashful","Sneezy","Sleepy"};
	//	dwarf[0] = new Dwarf(names[Math.random(),Math.random()*100])
		for(int i = 0;i<dwarf.length;i++){
			dwarf[i] = new Dwarf();
		}
		
		for(int j = 0;j<dwarf.length;j++){
			dwarf[j].setName(names[rand.nextInt(7)]);
			dwarf[j].setAge(rand.nextInt(100) + 1);
			
			
		}
		for(int i = 0;i<100;i++){
			System.out.println(dwarf[i].getName());
			System.out.println(dwarf[i].getAge());
		}
	






	}
 }
