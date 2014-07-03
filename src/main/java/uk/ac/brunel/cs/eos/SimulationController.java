
public class SimulationController {

	
	
	
	
	
//public static void main(String[] args){
		
		
// Although you can set this hear (because the main method is in WashingMachine, you should not.
// You should start the washing machine with something like a start() method.
// This method will then in turn execute the different stages.
// What we need to think about is how to interact with the machine.  I think we may need to somehow step
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
				

	}
	
	// I think the different stages should all be private methods.  They will only be called
	// by other methods in this class.  The washing machine will be started, and it will then proceed
	// until it has finished.  You may also then add some kind of interrupt method which will pause the 
	// washing machine for a short while to let another appliance use the electricity.
}
