package pkg;
import java.util.Scanner;
import java.util.Random;


public class Battery Charger{
	int chargingCost = 0;
	private int [] rateTable = new int[24];
	int cheapestchargetime = 0;
  
  public int getChargingCost(int startHour, int chargeTime){
  	
  for(int hour = startHour; hour < startHour + chargeTime; hour++){
    cost = cost + rateTable[hour % rateTable.length];
    chargingCost = cost;
  }
  return chargingCost;
  }
  
  public int getChargeStartTime(int chargeTime){
  	
  	for(int startHour = 1; startHour < length.rateTable; startHour++){
  		if(chargingCost < startHour){
  			cheapestchargetime = startHour;
  			
  		}
  	}
  	
  }
   
  

	
		
		
	

}

