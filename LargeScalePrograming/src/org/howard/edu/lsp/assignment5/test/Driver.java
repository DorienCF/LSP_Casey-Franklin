package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet.IntegerSetException;
import org.w3c.dom.events.EventException;

public class Driver {
	public static void main(String[] args) {
		
	IntegerSet SetA = new  IntegerSet();
	
	//Adding elements to set A:
	SetA.add(0);
	SetA.add(1);
	SetA.add(2);
	SetA.add(3);
	
	IntegerSet SetB = new IntegerSet();
	// Adding elements to Set B
	SetB.add(4);
	SetB.add(5);
	SetB.add(6);
	SetB.add(7);
	// Print out the  other functions to so the program is operational:
	
		// Printing out each set
		System.out.println("Set A: " + SetA.SetToString());
		System.out.println("Set B: " + SetB.SetToString());
		
		// Printing if each set is equal
		System.out.println("Are sets A and B equal: " + SetA.equals(SetB));
		
		// Smallest of each set
		try {
			System.out.println("The smallest of set A: " + SetA.smallest());

		System.out.println("The smallest of set B: " + SetB.smallest());
		
		//Largest of each set
		System.out.println("The Largest of Set A: " + SetA.largest());
		System.out.println("The Largest of Set B: " + SetB.largest());
		SetA.remove(0);
		} catch(IntegerSetException ex) {
			
            System.out.println("Execption:");
            System.out.println(ex.getMessage());
		}
		// Removing 0 and adding 4 to  set a
		
		SetA.add(4);
		System.out.println("New Set A: " + SetA.SetToString());
		
		//testing contains
		System.out.println("Does Set A contain '4'?: " + SetA.contains(4));
		
		//testing if the sets are empty
		System.out.println("Set A is empty: " + SetA.IsEmpty());
		
		//testing Union
		SetA.union(SetB);
		System.out.println("Union of A & B: " + SetA.SetToString());
		
		
		
		//testing clear
		SetB.clear();
		System.out.println("SetA: "+SetA.SetToString());
		// re-adding values:
		SetA.add(0);
		SetA.add(1);
		SetA.add(2);
		SetA.add(3);
		//testing intersection
		SetA.intersect(SetB);
		System.out.println("Intersection of Set A and B: " + SetA.SetToString());
	
	}

}
