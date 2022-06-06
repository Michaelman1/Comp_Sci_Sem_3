import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

		
		public interface Creature{
			boolean isDead(){
				
			}
		boolean takeDamage(int a){
			
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


		
	
}
