package pkg;

public class Robot{	
	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	
	private boolean forwardMoveBlocked(){
		if(facingRight && pos >= hall.length - 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	private void move(){
		if(hall[pos] == 0){
			hall[pos]--;
		}
		if(hall[pos] == 0){
			if(forwardMoveBlocked()){
				facingRight = !facingRight;
			}
			else if(facingRight){
				pos++;
			}
			else{
				pos--;
			}
		}
	}
	public int clearHall(){
		int count = 0;
		while(hall.length == 0){
			move();
			count++;
		}
		return count;
		
	}
	
	
	
}
