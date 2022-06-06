package pkg;

public class CVMath {
	int specialsquare;
	int x;
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public int findSpecialSquare(int a){
		x = 1;
		int i = 0;
		while(i != a){
			int mult = x*x;
		int sum = 0;
		int count = 1;
		while(mult < sum){
			sum = sum + count;
			
		}
		if(mult == sum){
			System.out.println(mult);
			i++;
		}
		
		
		}
			
		}
		
		
	
	
	}
	
	
}
