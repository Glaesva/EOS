
public class TumbleDryer {
	
	private String status;
	private boolean state;
	private int level;
	private double powerConsumption;
	private double powerPerMinute;		
	private Clock cycleTimeTD;
	
	public TumbleDryer(){
		state = false;
	}
	
	
	
	public void StartDryer(int level){
		
		state = true;
		cycleTimeTD.run();
		if(level == 1){
			powerPerMinute = 0.2;
		}
		if(level == 2){
			powerPerMinute = 0.4;
		}
		if(level == 3){
			powerPerMinute = 0.8;
		}					
		
		while(cycleTimeTD.getMinute() < 30){			
			powerConsumption = powerConsumption + powerPerMinute;
		}			
		
		if (cycleTimeTD.getMinute() == 30){
			state = false;
			cycleTimeTD.running = false;
		}
		
	}
	
	@Override
	public String toString() {		
		return " Tumble dryer power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
		
	
}
