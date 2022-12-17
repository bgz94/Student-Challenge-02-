import java.util.Stack;
import java.util.Scanner; //imports the class Scanner from the library java

public class StudentChallenge2{

  public static void main (String[] args) {
    
    	Scanner scanner = new Scanner(System.in); //creates a new Scanner object
	System.out.print("Input Your String:"); //give instructions to enter the string
    	String str = scanner.nextLine(); //the string entered is returned and assigned to the variable str
    	//System.out.println(str);

	Stack<Character> st = new Stack<>(); // Declare a stack as st

	for(int i = 0; i<str.length(); i++){
	
	  if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
		st.push(str.charAt(i));	  
	  } else if ( !st.empty() &&(   
				(str.charAt(i) == ']' && st.peek() == '[')||
				(str.charAt(i) == '}' && st.peek() == '{')||
				(str.charAt(i) == ')' && st.peek() == '('))){
	    	st.pop();
	    } else {
		st.push(str.charAt(i));
	      }
				
	}
	
	if (st.empty()){
	  System.out.println("Correct Format");
	} else{
	  System.out.println("Incorrect Format");
	  }
	

  }
}