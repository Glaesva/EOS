package uk.ac.brunel.cs.eos;


public class DishWasher {
	
	
	private boolean state = false;
	private double powerConsumption;
	private double powerPerMinute;
	private String status; 
	private Clock cycleTimeDW;
	private double Power_Prewash = 0;
	private double Power_Washing = 0;
	private double Power_Rinsing = 0;
	private double Power_Drying = 0;
	
	public void DishWasher(){
		state = false;
		
	}
	
	
	
	public void StartDishWasher(){
		state = true;
		cycleTimeDW.run();
		while(cycleTimeDW.getMinute() < 16){
			status = "Prewash";	
			Power_Prewash = Power_Prewash + 0.1;
		}
		while(cycleTimeDW.getMinute() < 31){
			status = "Washing";
			Power_Washing = Power_Washing + 0.3;
		}
		while(cycleTimeDW.getMinute() < 46){
			status = "Rinsing";
			Power_Rinsing = Power_Rinsing + 0.2;
		}
		while(cycleTimeDW.getMinute() < 61){
			status = "Drying";
			Power_Drying = Power_Drying + 0.4;
		}		
		
		if (cycleTimeDW.getHour() == 1){
			state = false;
			cycleTimeDW.running = false;
		}
		powerConsumption = Power_Prewash + Power_Washing + Power_Rinsing + Power_Drying;
		powerPerMinute = powerConsumption/60;
		
		
		
		}	
	
	
	
	@Override
	public String toString() {		
		return "Status: " + status + " Power consumed by the dishwasher in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
	
}
