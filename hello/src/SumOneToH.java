
public class SumOneToH {
	
	public int sum(int low, int high) {
		if (low == high) {
			return low;
		}
		else {

			return low + sum(low + 1, high);
	
		}
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOneToH a = new SumOneToH();
		System.out.println(a.sum(1, 10));
	}

}
