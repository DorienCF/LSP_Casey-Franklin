/**
 * 
 */
package org.howard.edu.lsp.assignment2;
import java.util.Scanner;

/**
 * @author doriencasey-franklin
 *
 */
public class SimpleWordProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

while(true) {
	 // User input
		Scanner input = new Scanner(System.in); // Sets var input to scan for input
		System.out.print("String? \n");
		 String usrInput = input.nextLine();
		if (usrInput == "Goodbye") {
			System.exit(0); // program termination
		}

		
	// String to string array 
	      String[] ch = null;
	      ch = usrInput.split((" "));
	      System.out.println("Tokens: ");
	      for (int i = 0; i < ch.length; i++) {
	         System.out.print(ch[i]+"\n"); 
	      }
	      
	      // addition
	      int sum = 0;
	      for (int i=0; i < ch.length; i++) {
	    			  int element = Integer.parseInt(String.valueOf(ch[i]));
	    	  		  sum = element + sum;
	      }
	      System.out.println("Sum: " + sum);
	      
	      // multiplication
	      int product = 1;
	      for (int i=0; i < ch.length; i++) {
	    			  int element = Integer.parseInt(String.valueOf(ch[i]));
	    	  		  product = element * product;
	    	  
	      }
	      System.out.println("Product: " + product);

	}
}
}