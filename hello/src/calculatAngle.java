
public class calculatAngle {

	public static void cal(int hour,int min) {
		float ang;
		if (hour <= 12) {
			ang = (hour*30+min/2-6*min)%360;
			if (ang < 0) 
				ang = -ang;
		}
		else {
			ang = ((hour-12)*30+min/2-6*min)%360;
			if (ang < 0) 
				ang = -ang;
		}
		
		if (ang > 180) {
			ang = 360-ang;
		}
		
		System.out.println(ang);;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatAngle.cal(3,27);
		calculatAngle.cal(12,0);
		calculatAngle.cal(13,50);
		calculatAngle.cal(24,0);
		calculatAngle.cal(15,0);
	}

}
