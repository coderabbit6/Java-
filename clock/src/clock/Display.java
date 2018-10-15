package clock;

public class Display {
	public int value = 0;
	public int limit = 0;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void incress() {
			value++;
			if(value == limit) {
				value = 0;
			}
//			System.out.println(value);
		}
	
	public int getvalue() {
		return value;
	}
	
	
	public static void main(String[] args) {
		Display a = new Display(24);
		a.incress();
	}

}
