
public class HotWaterTank {
	
	private int temperature;
	private double powerConsumption;
	private double powerPerMinute;
	private boolean state;
	private Clock cycleTimeHWT;
	
	public HotWaterTank(){
		
		powerPerMinute = 0.5;
		state = false;
	}
	
	
	public void TankOperation(int desiredTemp){
		
		state = true;
		cycleTimeHWT.run();
		while (temperature < desiredTemp){
			powerConsumption = powerConsumption + powerPerMinute;
			temperature++;
		}
		System.out.println(cycleTimeHWT);
		cycleTimeHWT.running = false;
		state = false;
	}

	
	
	@Override
	public String toString() {		
		return "Water temperature: " + temperature + " Hot water tank power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
}
