
public class Clock {
	
	private static Clock instance = null; 
	private int hour;
	private int minute;
	private int second;
	boolean running;
	
	private Clock(){
		
		setHour(0);
		setMinute(0);
		second = 0;
		running = false;
	}
	
	public synchronized static Clock getInstance() {
		if (instance==null) {
			instance = new Clock();
			instance.run();
		}
		return instance;
	}
	
	public void run(){			
		
		running = true;
		while(running = true){
		System.out.println(hour + ":" + minute + ":" + second);		
		second ++;		
		if(second == 60){
			second = 0;
			minute ++;
			if(minute == 60){
				minute = 0;
				hour ++;
				if (hour == 24){
					hour = 0;
					running = false;
				}
			}
		}		
	  }
	}
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}


//TODO: I have to implement toString method here!!




}
