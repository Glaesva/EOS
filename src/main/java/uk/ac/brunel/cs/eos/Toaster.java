
public class Toaster {
	
	private double powerConsumption;
	private double powerPerMinute;
	private int level;
	private boolean state = false;
	
	public void StartToaster(){
		
		state = true;
		if(level == 1){
			powerPerMinute = 0.1;
			if(level == 2){
				powerPerMinute = 0.2;
				if(level == 3){
					powerPerMinute = 0.3;
				}				
			}			
		}
		for(int i = 1; i <= 60; i++){		
			powerConsumption = powerConsumption + powerPerMinute;
		}	
	}
	
	
	
	@Override
	public String toString() {		
		return "Status: " + status + " Washing Machine power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
	
	
	
	
}
