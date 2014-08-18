package uk.ac.brunel.cs.eos;

public abstract class Appliance {
	
	public void startAt(final int hour) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				boolean finished = false;
				while (!finished)
				if (Clock.getInstance().getHour() >= hour){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finished = true;
					go();
				}
			}
		});
		thread.start();
	}
	
	abstract void go();
}
