
public class DishWasher {
	
	
	private boolean state = false;
	private double powerConsumption;
	private double powerPerMinute;
	private String status; 
	
	public void StartDishWasher(){
		state = true;
		
		if(status == "Prewash"){
			powerPerMinute = 0.2;
			if(status == "Washing"){
				powerPerMinute = 0.4;
				if(status == "Rinsing"){
					powerPerMinute = 0.2;
					if(status == "Drying"){
						powerPerMinute = 0.3;
					}
				}
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {		
		return "Status: " + status + " Washing Machine power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
	
}
