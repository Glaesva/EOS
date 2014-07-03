
public class TumbleDryer {
	
	private boolean state;
	private int level;
	private double powerConsumption;
	private double powerPerMinute;	
	private double cycleTime;
	Stopwatch tdstopwatch = new Stopwatch(00, 00, 00);
	
	public void StartDryer(int level){
		TumbleDryer td = new TumbleDryer();
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
			System.out.println("Time: " + i + td);
			powerConsumption = powerConsumption + powerPerMinute;
			
		}
		
	}
	
	@Override
	public String toString() {		
		return "Status: " + status + " Washing Machine power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
	
	
	
	
	
	
}
