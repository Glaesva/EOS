
public class WashingMachine {

	private boolean state;
	private String status;
	private double powerConsumption;
	private double powerPerMinute;	
	private double cycleTime;
	Stopwatch wmstopwatch = new Stopwatch(00, 00, 00);
	
	//Constructor Method
	public WashingMachine(){
		state = false;
		status = "Available";			
	}
	
	
	
	public void StartWashingMachine(){
		
		
		WashingMachine wm = new WashingMachine();
		wm.state = true;
		wmstopwatch.run();
		wm.PrewashStage();
		wm.WashingStage();
		wm.RinsingStage();
		wm.SpinningStage();
		wmstopwatch.running = false;
		
		
		powerPerMinute = powerConsumption/60;
		System.out.println(wm);
	}
	
	private void PrewashStage(){		
		
		double Power_Prewash = 0;
		status = "Prewash";
		while (wmstopwatch.minute < 16 )		
			Power_Prewash = Power_Prewash + 0.02;
		}	
		powerConsumption = powerConsumption + Power_Prewash;
	}
	
	private void WashingStage(){
		
		double Power_Washing = 0;
		
		for (int i = 45; i >= 31; i--){			
			Power_Washing = Power_Washing + 0.01;
		}	
		powerConsumption = powerConsumption + Power_Washing;
	}
	
	private void RinsingStage(){	
				
		double Power_Rinsing = 0;
		
		for (int i = 30; i >= 16; i--){			
			Power_Rinsing = Power_Rinsing + 0.01;
		}	
		powerConsumption = powerConsumption + Power_Rinsing;
	}
	private void SpinningStage(){		
		
		double Power_Spinning = 0;
		
		for (int i = 15; i >= 1; i--){
			
			Power_Spinning = Power_Spinning + 0.03;
		}	
		powerConsumption = powerConsumption + Power_Spinning;
	}
	
	
	
	@Override
	public String toString() {		
		return "Status: " + status + " Washing Machine power consumption in the cycle: " + powerConsumption + " Avarage power consumed per minute: " + powerPerMinute;
	}
	
}