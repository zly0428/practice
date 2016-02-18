package Solutions;

import java.util.ArrayList;

public class LangestWord {
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> a = new ArrayList<>();
        a.add(dictionary[0]);
        String tmp = dictionary[0]; 
        int l = tmp.length();
        for (int i = 1; i< dictionary.length; i++) {
            String tt = dictionary[i];
            if (tt.length() > l) {
                l = tt.length();
                a.clear();
                a.add(dictionary[i]);
            }
            else if (tt.length() == l) {
                a.add(dictionary[i]);
            }
        }
        return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LangestWord lon = new LangestWord();
		String[] a = {
				  "dog",
				  "google",
				  "facebook",
				  "facelove",
				  "blabla"
				};
		System.out.println(lon.longestWords(a));
	}

}
