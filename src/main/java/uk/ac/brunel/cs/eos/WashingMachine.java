package uk.ac.brunel.cs.eos;

public class WashingMachine {
// Attributes
// State - On/Off; Status - Prewash/Washing/Rinsing/Spinning;
// Power Consumption - A value for each stage in KWh; Water Consumption - A value for each stage in litres	
	private boolean state;
	private String status;
	private double powerConsumption;
	private double waterConsumption;	
	
		
	//Constructor Method
	public WashingMachine(){
		state = false;
		status = "Available";		
	}
	
	
	public static void main(String[] args){
		
		WashingMachine wm = new WashingMachine();
		
		// Although you can set this hear (because the main method is in WashingMachine, you should not.
		// You should start the washing machine with something like a start() method.
		// This method will then in turn execute the different stages.
		// What we need to think about is how to interract with the machine.  I think we may need to somehow step
		// through its cycle minute by minute, so that it can tell us its consumption each minute, and also so it has
		// the opportunity to 'gossip' with any other appliances to decide whether it is going to stop working for a bit
		// to allow another appliance a turn.
		//
		// I think it may be a good idea for the moment to think of the idea of a central controller as iteration 1.
		//
		// If that works out, we can then see how to get rid of the central controller.
		//
		// Ideally you should remove the whole main method.  The main method should be in some kind of SimulationController 
		// class, or something like that!
		wm.state = true;
		System.out.println("status: " + wm.status);
		
		// 
		wm.Prewash_Stage();
		wm.Washing_Stage();
		wm.Rinsing_Stage();
		wm.Spinning_Stage();		

	}
	
	// I think the different stages should all be private methods.  They will only be called
	// by other methods in this class.  The washing machine will be started, and it will then proceed
	// until it has finished.  You may also then add some kind of interrup method which will pause the 
	// washing machine for a short while to let another appliance use the electricity.
	public void Prewash_Stage(){
		status = "Prewash";
		System.out.println("status: " + status);
		int Water_Prewash = 0;
		double Power_Prewash = 0;
		
		for (int i = 60; i >= 46; i--){
			Water_Prewash = Water_Prewash + 4;
			Power_Prewash = Power_Prewash + 0.02;
		}
		System.out.println("Water consumed during Prewash: " + Water_Prewash );
		System.out.println("Power consumed during Prewash: " + Power_Prewash);
	}
	
	public void Washing_Stage(){
		
		status = "Washing";
		System.out.println("status: " + status);
		double Power_Washing = 0;
		
		for (int i = 45; i >= 31; i--){			
			Power_Washing = Power_Washing + 0.01;
		}
		
		System.out.println("Power consumed during Washing: " + Power_Washing);
	}
	
	public void Rinsing_Stage(){
		
		status = "Rinsing";
		System.out.println("status: " + status);
		double Water_Rinsing = 0;
		double Power_Rinsing = 0;
		
		for (int i = 30; i >= 16; i--){
			
			Water_Rinsing = Water_Rinsing + 12;
			Power_Rinsing = Power_Rinsing + 0.01;
		}
		System.out.println("Water consumed during Rinsing Stage: " + Water_Rinsing);
		System.out.println("Power consumed during Rinsing Stage: " + Power_Rinsing);
	}
	public void Spinning_Stage(){
		
		status = "Spinning";
		System.out.println("status: " + status);
		double Power_Spinning = 0;
		
		for (int i = 15; i >= 1; i--){
			
			Power_Spinning = Power_Spinning + 0.03;
		}
		
		System.out.println("Power consumed during Spinning: " + Power_Spinning);
	}
	
	public String toString() {
		// TODO : Implement me!
		return "something about the washing machine . .  .";
	}
	
}
