
public class newClock {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}
class Clock {
	private Display hour=new Display(24);
	private Display minute=new Display(60);
	private Display second=new Display(60);
	
//	public void start() {
//		while (true) {
//			minute.increase();
//			if (second.getValue()==0) {
//				minute.increase();
//			}
//			if (minute.getValue()==0) {
//				hour.increase();
//			}
//			System.out.printf("%02d:%02d:%02d\n",hour.getValue(),minute.getValue(),second.getValue());
//		}
//		
//	}
	public Clock(int hour,int minute,int second) {
		this.hour.value=hour;
		this.minute.value=minute;
		this.second.value=second;
	}
	
	public void tick() {
		
			second.increase();
			if (second.getValue()==0) {
				minute.increase();
			
			if (minute.getValue()==0) {
				hour.increase();
			}
			}
		
		
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(),second.getValue());
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Clock clock=new Clock();
//		clock.start();
//	}

}

class Display {
	public int value=0;
	private int limit=0;
	
	public Display(int limit)
	{
		this.limit=limit;
	}
	
	public void increase() {
		value++;
		if (value==limit) 
		{
			value=0;
		}
	}
	public int getValue() {
		return value;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Display d=new Display(24);
//		for(;;) {
//			d.increase();
//			System.out.println(d.getValue());
//		}
//	}

}