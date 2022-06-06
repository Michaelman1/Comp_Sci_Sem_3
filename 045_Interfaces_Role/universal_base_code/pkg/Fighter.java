package pkg;
import java.util.Scanner;
import java.util.Random;


public class Fighter{
	Random rand = new Random();
	String name;
	int health;
	int attack;

	public Fighter(){
		name = "jam";
		health = rand.nextInt(15) + 5;
		attack = 10;
	}
	public Fighter(String a){
		this.name = a;
		health = 0;
		attack = 0;
	}
	
	public void setHealth(int a){
		health = a;
	}
	public int getHealth(){
		return health;
	}
	public String getName(){
		return name;
	}
	
	public void Attack(Warrior a){
		attack = rand.nextInt(10);
		health = health - attack;
	}
	public void Attack(Wizard a){
		attack = rand.nextInt(8);
		health = health - attack;
	}

}