package Solutions;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String time = in.nextLine();
		in.close();
		String[] array = time.split(":");
		char sig = array[2].charAt(2);
		if ( sig == 'a' || sig == 'A' ) {
			if ( array[0].equals("12")) {
				String am12 = "00";
				am12 += ":"+array[1]+":"+array[2].charAt(0)+array[2].charAt(1);
				System.out.println(am12);
			}
			else {
				System.out.print(array[0]+":"+array[1]+":"+array[2].charAt(0)+array[2].charAt(1));
			}

		}
		else {
			int pmhour = Integer.parseInt(array[0]);
			if ( pmhour < 12) {
				pmhour +=12;
				String pmtime = pmhour + ":" + array[1] + ":" + array[2].charAt(0) + array[2].charAt(1);
				System.out.println(pmtime);
			}
			else 
				System.out.println(array[0] + ":" + array[1] + ":" + array[2].charAt(0) + array[2].charAt(1));
		}
	}

}
