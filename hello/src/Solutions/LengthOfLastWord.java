package Solutions;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Write your code here
        String[] ss = s.split(" ");
        int index = ss.length -1;
        return ss[index].length();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
