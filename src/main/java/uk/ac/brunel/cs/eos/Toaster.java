
public class Toaster {
	
	private double powerConsumption;
	private double powerPerMinute;
	private int level;
	private boolean state;
	private Clock cycleTimeT;
	
	public Toaster(){
		state = false;
	}
	
	
	public void StartToaster(int level){
		
		state = true;
		cycleTimeT.run();
		if(level == 1){
			powerPerMinute = 0.1;
		}
		if(level == 2){
			powerPerMinute = 0.2;
		}
		if(level == 3){
			powerPerMinute = 0.3;
		}					
		
		while(cycleTimeT.getMinute() < 5){			
			powerConsumption = powerConsumption + powerPerMinute;
		}			
		
		if (cycleTimeT.getMinute() == 5){
			state = false;
			cycleTimeT.running = false;
		}
	}
	
	
	
	@Override
	public String toString() {		
		return "Toaster power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
	
	
	
	
}
