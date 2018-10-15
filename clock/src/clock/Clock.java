package clock;

public class Clock {
	public Display hour = new Display(24);
	public Display minute = new Display(60);
	
	public void start() {
		while(true) {
			minute.incress();
			if(minute.getvalue() == 0) {
				hour.incress();
			}
			System.out.printf("%02d:%02d\n",hour.getvalue(),minute.getvalue());
		}
	}
	
	
	public static void main(String[] args) {
		Clock a = new Clock();
		a.start();

	}

}
