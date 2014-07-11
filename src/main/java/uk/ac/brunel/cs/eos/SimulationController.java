
public class SimulationController {

	private Clock ctrlClock = Clock.getInstance();
	
	
	
	
	public static void main(String[] args){
		
		SimulationController SC = new SimulationController();
		Clock.getInstance();
		SC.StartAppliances();

	}
	
	
	private void StartAppliances(){
		
		WashingMachine wm = new WashingMachine();
		DishWasher dw = new DishWasher();
		TumbleDryer td = new TumbleDryer();
		HotWaterTank hwt = new HotWaterTank();
		
		if (ctrlClock.getHour() == 7){
			wm.StartWashingMachine();
		}
		if (ctrlClock.getHour() == 11){
			dw.StartDishWasher();
		}
		if (ctrlClock.getHour() == 13){
			td.StartDryer(3);
		}
		if (ctrlClock.getHour() == 17){
			hwt.TankOperation(35);
		}
		
		
		
		
	}
	

}
