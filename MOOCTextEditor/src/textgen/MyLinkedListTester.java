/**
 * 
 */
package textgen;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author UC San Diego MOOC team
 *
 */
public class MyLinkedListTester {

	private static final int LONG_LIST_LENGTH =10; 

	MyLinkedList<String> shortList;
	MyLinkedList<Integer> emptyList;
	MyLinkedList<Integer> longerList;
	MyLinkedList<Integer> list1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Feel free to use these lists, or add your own
	    shortList = new MyLinkedList<String>();
		shortList.add("A");
		shortList.add("B");
		emptyList = new MyLinkedList<Integer>();
		longerList = new MyLinkedList<Integer>();
		for (int i = 0; i < LONG_LIST_LENGTH; i++)
		{
			longerList.add(i);
		}
		list1 = new MyLinkedList<Integer>();
		list1.add(65);
		list1.add(21);
		list1.add(42);
		
	}

	
	/** Test if the get method is working correctly.
	 */
	/*You should not need to add much to this method.
	 * We provide it as an example of a thorough test. */
	@Test
	public void testGet()
	{
		//test empty list, get should throw an exception
		try {
			emptyList.get(0);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
			
		}
		
		// test short list, first contents, then out of bounds
		assertEquals("Check first", "A", shortList.get(0));
		assertEquals("Check second", "B", shortList.get(1));
		
		try {
			shortList.get(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			shortList.get(2);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		// test longer list contents
		for(int i = 0; i<LONG_LIST_LENGTH; i++ ) {
			assertEquals("Check "+i+ " element", (Integer)i, longerList.get(i));
		}
		
		// test off the end of the longer array
		try {
			longerList.get(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			longerList.get(LONG_LIST_LENGTH);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		}
		
	}
	
	
	/** Test removing an element from the list.
	 * We've included the example from the concept challenge.
	 * You will want to add more tests.  */
	@Test
	public void testRemove()
	{
		int a = list1.remove(0);
		assertEquals("Remove: check a is correct ", 65, a);
		assertEquals("Remove: check element 0 is correct ", (Integer)21, list1.get(0));
		assertEquals("Remove: check size is correct ", 2, list1.size());
		
		// TODO: Add more tests here
		try {
			list1.remove(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		//System.out.println(longerList);

		//System.out.println(longerList);
		for ( int i = LONG_LIST_LENGTH-1; i > -1; i--) {
			Integer removed = longerList.remove(i);
			assertEquals("Remove: check element is correct ", (Integer)i, (Integer)removed);
			assertEquals("Remove: check size is correct ", i, longerList.size());
		}

		try {
			list1.remove(LONG_LIST_LENGTH);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
	}
	
	/** Test adding an element into the end of the list, specifically
	 *  public boolean add(E element)
	 * */
	@Test
	public void testAddEnd()
	{
        // TODO: implement this test
		int testNumber = 5;
		String testString = "C";
		emptyList.add(testNumber);
		assertEquals("TestAddEnd",(Integer)testNumber, emptyList.get(emptyList.size-1));
		longerList.add(testNumber);
		assertEquals("TestAddEnd",(Integer)testNumber, longerList.get(longerList.size-1));
		list1.add(testNumber);
		assertEquals("TestAddEnd",(Integer)testNumber, list1.get(list1.size-1));
		shortList.add(testString);
		assertEquals("TestAddEnd",(String)testString, shortList.get(shortList.size-1));
	}

	
	/** Test the size of the list */
	@Test
	public void testSize()
	{
		// TODO: implement this test
		assertEquals("TestSize",(Integer)0, (Integer)emptyList.size());
		assertEquals("TestSize",(Integer)2, (Integer)shortList.size());
		assertEquals("TestSize",(Integer)10, (Integer)longerList.size());
		assertEquals("TestSize",(Integer)3, (Integer)list1.size());
	}

	
	
	/** Test adding an element into the list at a specified index,
	 * specifically:
	 * public void add(int index, E element)
	 * */
	@Test
	public void testAddAtIndex()
	{
        // TODO: implement this test
		
		int i = 0;
		int temp = list1.get(i);
		//System.out.println(list1);
		list1.add(i,i);
		assertEquals("AddAtIndex: check element" + i + "is correct", (Integer)i, list1.get(i));
		assertEquals("AddAtIndex: check element" + (i+1) + "is correct", (Integer)temp, list1.get(i+1));
		assertEquals("AddAtIndex: size",(Integer)4, (Integer)list1.size());
		//System.out.print(list1);
		
		longerList.add(0,10);
		assertEquals("Add: check element is correct ", (Integer)10, longerList.get(0));
		assertEquals("Add: check size is correct ", 11, longerList.size());
		
		try {
			longerList.add(3,null);
			fail("Check out of bounds");
		}
		catch (NullPointerException e) {
		
		}
		
		try {
			longerList.add(-1,2);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}

		try {
			longerList.add(14,3);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		}

		
		/*
		for ( int i = 0; i < list1.size; i++ ) {
			int temp = list1.get(i);
			list1.add(i, i);
			assertEquals("AddAtIndex: check element" + i + "is correct", (Integer)i, list1.get(i));
			assertEquals("AddAtIndex: check element" + (i+1) + "is correct", (Integer)temp, list1.get(i+1));
		}
		for ( int i = 0; i < longerList.size; i++ ) {
			int temp = longerList.get(i);
			longerList.add(i,i);
			assertEquals("AddAtIndex: check element" + i + "is correct", (Integer)i, longerList.get(i));
			assertEquals("AddAtIndex: check element" + (i+1) + "is correct", (Integer)temp, longerList.get(i+1));
		}
		for ( int i = 0; i < shortList.size; i++ ) {
			String temp = shortList.get(i);
			shortList.add(i,i+"");
			assertEquals("AddAtIndex: check element" + i + "is correct", (Integer)i, shortList.get(i));
			assertEquals("AddAtIndex: check element" + (i+1) + "is correct", (String)temp, shortList.get(i+1));
		}
		*/
	}
	
	/** Test setting an element in the list */
	@Test
	public void testSet()
	{
	    // TODO: implement this test
	    for ( int i = 0; i < list1.size; i++) {
	    	int oldV = list1.get(i);
	    	int oldVbySet = list1.set(i, i);
	    	assertEquals("testSet: check element" + i + "is correct", (Integer)i, list1.get(i));
	    	assertEquals("testSet: check old element" + i + "is correct", oldV, oldVbySet);
	    }
	    assertEquals("testSet: check size is correct ", 3, list1.size());
	    
	    try {
			longerList.set(-1,2);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			longerList.set(LONG_LIST_LENGTH,3);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		}
	}
	
	
	// TODO: Optionally add more test methods.
	
}
