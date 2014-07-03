
public class HotWaterTank {
	
	private int temperature;
	private double powerConsumption;
	private double powerPerMinute;
	private boolean state = false;
	
	public void HotWaterTank(){
		
	}
	
	
	public void TankOperation(int desiredTemp){
		
		state = true;
		while (temperature < desiredTemp){
			powerConsumption = powerConsumption + powerPerMinute;
			temperature++;
		}
		state = false;
	}

	
	
	@Override
	public String toString() {		
		return "Water temperature: " + temperature + " Hot water tank power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
}
