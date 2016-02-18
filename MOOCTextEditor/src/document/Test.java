package document;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static int countSyllables(String word)
	{
		// TODO: Implement this method so that you can call it from the 
	    // getNumSyllables method in BasicDocument (module 1) and 
	    // EfficientDocument (module 2).
		
		ArrayList<String> tokens = new ArrayList<String>();
		String pattern = "[bcdfghjklmnpqrstvwxz]*[aeiouy]+[bcdfghjklmnpqrstvwxz]*";
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(word);
		while ( m.find()) {
			tokens.add(m.group());
		}
		
		if ( tokens.size() > 1 && tokens.get(tokens.size()-1).equals("e")) {
			return tokens.size()-1;
		}
		
	    return tokens.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSyllables("is"));
	}
//	sentence, with, lots, of, commas.!  " + "(And some poaren)).  The output is: 7.5.
}
