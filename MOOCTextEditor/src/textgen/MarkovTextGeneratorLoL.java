package textgen;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * An implementation of the MTG interface that uses a list of lists.
 * @author UC San Diego Intermediate Programming MOOC team 
 */
public class MarkovTextGeneratorLoL implements MarkovTextGenerator {

	// The list of words with their next words
	private List<ListNode> wordList; 
	
	// The starting "word"
	private String starter;
	
	// The random number generator
	private Random rnGenerator;
	
	public Random getRandom() {
		return rnGenerator;
	}
	
	public MarkovTextGeneratorLoL(Random generator)
	{
		wordList = new LinkedList<ListNode>();
		starter = "";
		rnGenerator = generator;
	}
	
	
	/** Train the generator by adding the sourceText */
	@Override
	public void train(String sourceText)
	{
		// TODO: Implement this method
		// get the arrayList of words in the sourceText
			if ( sourceText.length() == 0 ) return;
			// for the sourceText only contains words except Punctuation 
/*			ArrayList<String> arrayList = new ArrayList<String>();
			String pattern = "[a-zA-Z]+";
			Pattern tokSplitter = Pattern.compile(pattern);
			Matcher m = tokSplitter.matcher(sourceText);
			while ( m.find()) {
				arrayList.add(m.group());
			}
*/
			// to get an arraylist of words including punctuations
			ArrayList<String> arrayList = new ArrayList<String>();
			String[] s = sourceText.split(" ");
			for ( int i = 0; i < s.length; i++) {
				arrayList.add(s[i]);
			}
			
			starter = arrayList.get(0);
			String preWord = starter;
			
			for ( int i = 1; i < arrayList.size(); i++) {
				String w = arrayList.get(i);
				boolean inWordList = false;
				for ( ListNode node : wordList) {
					// equals 比较内容，切记勿用“==”
					if ( node.getWord().equals(preWord)  ) {
						node.addNextWord(w);
						inWordList = true;
						break;
					}
				}
				if ( inWordList == false) {
					ListNode newNode = new ListNode(preWord);
					newNode.addNextWord(w);
					wordList.add(newNode);
				}
				preWord = w;
			}
			
			String lastWord = arrayList.get(arrayList.size()-1);
			// to check if the lastWord in the wordList
			boolean flag = false;
			for (  ListNode node : wordList) {
				if ( node.getWord().equals(lastWord)) {
					node.addNextWord(starter);
					flag = true;
					break;
				}
			}
			if ( flag == false) {
				ListNode newNode = new ListNode(lastWord);
				newNode.addNextWord(starter);
				wordList.add(newNode);
			}

	}

	/** 
	 * Generate the number of words requested.
	 */
	@Override
	public String generateText(int numWords) {
	    // TODO: Implement this method
		if ( numWords == 0) return "";
		if ( wordList.size() == 0 ) return "";
		String currWord = starter;
		String output = "";
		output = currWord +" ";
		while ( numWords > 1 ) {
			String w = "";
			boolean flag = false;
			for ( ListNode node : wordList ) {
				if ( node.getWord().equals(currWord) ) {
					ListNode n = wordList.get(wordList.indexOf(node));
					w = n.getRandomNextWord(rnGenerator);
					output += w+" ";
					flag = true;
					break;
				}
			}
			if ( flag == false) {
				return "";
			}
			currWord = w;
			numWords--;
		}
		return output;
	}
	
	
	// Can be helpful for debugging
	@Override
	public String toString()
	{
		String toReturn = "";
		for (ListNode n : wordList)
		{
			toReturn += n.toString();
		}
		return toReturn;
	}
	
	/** Retrain the generator from scratch on the source text */
	@Override
	public void retrain(String sourceText)
	{
		// TODO: Implement this method.
		wordList = new LinkedList<ListNode>();
		starter = "";
		
		train(sourceText); 
	}
	
	// TODO: Add any private helper methods you need here.
	
	
	/**
	 * This is a minimal set of tests.  Note that it can be difficult
	 * to test methods/classes with randomized behavior.   
	 * @param args
	 */
	public static void main(String[] args)
	{
		// feed the generator a fixed random value for repeatable behavior

		MarkovTextGeneratorLoL gen = new MarkovTextGeneratorLoL(new Random(42));
		String textString = "Hello.  Hello there.  This is a test.  Hello there.  Hello Bob.  Test again.";
		System.out.println(textString);
		gen.train(textString);
		
		System.out.println(gen);
		System.out.println(gen.generateText(20));
		String textString2 = "You say yes, I say no, "+
				"You say stop, and I say go, go, go, "+
				"Oh no. You say goodbye and I say hello, hello, hello, "+
				"I don't know why you say goodbye, I say hello, hello, hello, "+
				"I don't know why you say goodbye, I say hello. "+
				"I say high, you say low, "+
				"You say why, and I say I don't know. "+
				"Oh no. "+
				"You say goodbye and I say hello, hello, hello. "+
				"I don't know why you say goodbye, I say hello, hello, hello, "+
				"I don't know why you say goodbye, I say hello. "+
				"Why, why, why, why, why, why, "+
				"Do you say goodbye. "+
				"Oh no. "+
				"You say goodbye and I say hello, hello, hello. "+
				"I don't know why you say goodbye, I say hello, hello, hello, "+
				"I don't know why you say goodbye, I say hello. "+
				"You say yes, I say no, "+
				"You say stop and I say go, go, go. "+
				"Oh, oh no. "+
				"You say goodbye and I say hello, hello, hello. "+
				"I don't know why you say goodbye, I say hello, hello, hello, "+
				"I don't know why you say goodbye, I say hello, hello, hello, "+
				"I don't know why you say goodbye, I say hello, hello, hello,";
		System.out.println(textString2);
		gen.retrain(textString2);
		System.out.println(gen);
		System.out.println(gen.generateText(20));
	}

}

/** Links a word to the next words in the list 
 * You should use this class in your implementation. */
class ListNode
{
    // The word that is linking to the next words
	private String word;
	
	// The next words that could follow it
	private List<String> nextWords;
	
	ListNode(String word)
	{
		this.word = word;
		nextWords = new LinkedList<String>();
	}
	

	
	public String getWord()
	{
		return word;
	}

	public void addNextWord(String nextWord)
	{
		nextWords.add(nextWord);
	}
	
	public String getRandomNextWord(Random generator)
	{
		// TODO: Implement this method
	    // The random number generator should be passed from 
	    // the MarkovTextGeneratorLoL class

		int sizeOfNextWords = nextWords.size();
		if ( sizeOfNextWords == 0) {
			return getWord();
		}
		else {
			int index = generator.nextInt(sizeOfNextWords);
			return nextWords.get(index);
		}
	}

	public String toString()
	{
		String toReturn = word + ": ";
		for (String s : nextWords) {
			toReturn += s + "->";
		}
		toReturn += "\n";
		return toReturn;
	}
	
}


