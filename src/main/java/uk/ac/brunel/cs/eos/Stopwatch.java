
public class Stopwatch {

	private int hour;
	private int minute;
	private int second;
	boolean running;
	
	public Stopwatch(int hour, int minute, int second){
		hour = 00;
		minute = 00;
		second = 00;
		running = false;
	}
	
	public void run(){		
		
		running = true;
		while(running = true){
		System.out.println(hour + ":" + minute + ":" + second);		
		second ++;		
		if(second == 59){
			second = 00;
			minute ++;
			if(minute == 59){
				minute = 00;
				hour ++;
			}
		}		
	  }
	}
	
}
