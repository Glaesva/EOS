
public class Stopwatch {
	
	private static Stopwatch instance = null; 

	private int hour;
	private int minute;
	private int second;
	boolean running;
	
	private Stopwatch(){
		hour = 0;
		minute = 0;
		second = 0;
		running = false;
	}
	
	public synchronized static Stopwatch getInstance() {
		if (instance==null) {
			instance = new Stopwatch();
		}
		return instance;
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
