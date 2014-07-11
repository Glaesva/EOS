
public class WashingMachine {

	private boolean state;
	private String status;
	private double powerConsumption;
	private double powerPerMinute;	
	private double cycleTime;
	private double Power_Prewash = 0;
	private double Power_Washing = 0;
	private double Power_Rinsing = 0;
	private double Power_Spinning = 0;
	
	
	public WashingMachine(){
		state = false;
		status = "Available";			
	}
	
	
	
	public void StartWashingMachine(){
		
		
		state = true;
		cycleTimeWM.run();
		while(cycleTimeWM.getMinute() < 16){
			status = "Prewash";	
			Power_Prewash = Power_Prewash + 0.1;
		}
		while(cycleTimeWM.getMinute() < 31){
			status = "Washing";
			Power_Washing = Power_Washing + 0.3;
		}
		while(cycleTimeWM.getMinute() < 46){
			status = "Rinsing";
			Power_Rinsing = Power_Rinsing + 0.2;
		}
		while(cycleTimeWM.getMinute() < 61){
			status = "Spinning";
			Power_Spinning = Power_Spinning + 0.5;
		}		
		
		if (cycleTimeWM.getHour() == 1){
			state = false;
			cycleTimeWM.running = false;
		}
		powerConsumption = Power_Prewash + Power_Washing + Power_Rinsing + Power_Spinning;
		powerPerMinute = powerConsumption/60;
	}
	
	
	
	@Override
	public String toString() {		
		return "Status: " + status + " Washing Machine power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
}