package Solutions;


import java.util.Scanner;
import java.util.Stack;



public class Braces{
	   
	public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);

	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	            //Complete the code
          char[] c = input.toCharArray();
           Stack<Character> st = new Stack<Character>();
           for (int i = 0; i < c.length; i ++) {
               if ( c[i] == '(' || c[i] == '[' || c[i] =='{') {
                   st.push(c[i]);
               }
               if ( c[i] == ')' ) {
                   if ( st.empty()) {
                       st.push(c[i]);
                   }
                   else if ( st.peek() == '(')
                       st.pop();
               }
               if ( c[i] == ']' ) {
                   if ( st.empty()) {
                       st.push(c[i]);
                   }
                   else if ( st.peek() == '[')
                       st.pop();
               }
               if ( c[i] == '}' ) {
                   if ( st.empty()) {
                       st.push(c[i]);
                   }
                   else if ( st.peek() == '{')
                       st.pop();
               }
           }
           if ( st.empty()) System.out.println("true");
           else System.out.println("false");
	      }
	      
	   }
	}
