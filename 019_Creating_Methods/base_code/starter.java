import java.util.Scanner;
import java.util.Random;

class Dog {
	String dogname;
	int dogage = 5;
	String dogbreed;


	public Dog(){
	dogname = "Clifford";
	dogage = 3;
	dogbreed = "big red dog";
}

	public Dog(String a){
		dogname = "George";
		dogage = 1;
		dogbreed = "dog dog";
	}
	public Dog(String a, String b){
		dogname = "George";
		dogbreed = b;
		dogage = 1;
	}
	public Dog(String a, int b){
		dogname = "George";
		dogage = b;
		dogbreed = "dog dog";
	}
		public void setName(String a){
			dogname = "max";
		}
		public void setAge(int a){
			dogage = 2;
		}
		public void setBreed(String a){
			dogbreed = a;
		}
		public void getName(){
			System.out.print(dogname);
		}
		public void getAge(){
			System.out.print(dogage);
		}
		public void getBreed(){
			System.out.println(dogbreed);
		}
		public boolean isSleeping(){
			Random rand = new Random();
			int sleeping = rand.nextInt(2);
			int heads = 0;
			int tails = 1;
			if(sleeping == 0){
				System.out.println("dog awake");
			return false;
			}
			else{
				System.out.println("dog asleep");
			return true;
			}
		}
			public void bark(){
				System.out.println(dogname + "barks");
			}
}
			class starter{
			
				public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
	
				Dog dog1 = new Dog();
				Dog dog2 = new Dog();
				dog1.isSleeping();
				dog1.bark();
				dog2.isSleeping();
				dog2.bark();
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
				}
				
				
			
		
		