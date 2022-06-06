package pkg;
import java.util.Scanner;
import java.util.Random;

public interface Role{
	
	public void Attack(Warrior a){
		attack = rand.nextInt(10);
		health = health - attack;
	}
	public void Attack(Wizard a){
		attack = rand.nextInt(8);
		health = health - attack;
	}
}