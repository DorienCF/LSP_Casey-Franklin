package org.howard.edu.lsp.assignment6.junit;
import org.howard.edu.lsp.assignment6.integerset.IntergerSet;
import org.howard.edu.lsp.assignment6.integerset.IntergerSet.IntegerSetException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class junit {
	
	// Initializing them for the rest of the...
		IntergerSet SetA = new IntergerSet();
		IntergerSet SetB = new IntergerSet();

	
	@Test
	public void Test001 () { //addTest 
		System.out.println("Set before addTest: " + SetA.SetToString());
		SetA.add(210);
		SetA.add(211);
		SetA.add(112);
		System.out.println(">> "+SetA.SetToString());
		assertEquals("[210, 211, 112]",SetA.SetToString());//remember there are spaces in-between indexes.
		
	}
	@Test
	public void Test002 () //clearTest
	{
		SetA.add(74918);
		SetA.add(183902);
		SetA.add(918490);
		System.out.println("Set before clearTest: " + SetA.SetToString());
		SetA.clear();
		System.out.println(">> "+SetA.SetToString());
		assertEquals("[]", SetA.SetToString());
		
		
	}
	@Test
	public void  Test003 () //lenghtTest
	{
		System.out.println("Set lenght before lenghtTest: "+ SetA.length());
		
		for(int i=0; i <8; i++) {
			SetA.add(i);
		}
		System.out.println(">>" + SetA.length());
		assertEquals(8,SetA.length());
		
	}
	@Test
	public void Test004() //equalsTest
	{
		System.out.println("Set  before equalsTest: "+ SetA.SetToString());
		SetB.add(0);
		SetB.add(1);
		SetB.add(2);
		SetB.add(3);
		SetB.add(4);
		for(int i=0; i <5; i++) {
			SetA.add(i);
		}
		assertEquals(SetB.SetToString(),SetA.SetToString());
		System.out.println(">> "+SetA.SetToString());
		
		
	}
	@Test
	public void Test005 () //containtsTest
	{
		SetA.add(0);
		SetA.add(1);
		SetA.add(2);
		SetA.add(3);
		SetA.add(4);
		System.out.println("Set  before containtsTest: "+ SetA.SetToString());
		assertTrue(SetA.contains(3));
		System.out.println(">> 3, " +SetA.contains(3));
	}
	@Test
	public void Test006() throws IntegerSetException //largestTest
, org.howard.edu.lsp.assignment6.integerset.IntergerSet.IntegerSetException
	{
		SetA.add(000);
		SetA.add(10);
		SetA.add(02);
		SetA.add(300);
		SetA.add(40);
		assertNotEquals(10,SetA.largest());
		assertEquals(300,SetA.largest());
		System.out.println(">> Largest 300, " +SetA.largest());
	
	}
		
	@Test
	public void Test007() throws IntegerSetException //smallestTest
	{
		SetA.add(24719838);
		SetA.add(38389084);
		SetA.add(38478913);
		SetA.add(12341029);
		SetA.add(98492337);
		System.out.println("Set before smallestTest: "+ SetA.SetToString());
		assertEquals(12341029,SetA.smallest());
		System.out.println(">> Smallest Value: " + SetA.smallest());
	}
	@Test
	public void Test008() throws IntegerSetException //removeTest
	{
		SetA.add(10);
		SetA.add(100);
		SetA.add(1000);
		SetA.add(10000);
		SetA.add(11);
		System.out.println("Set before removeTest: "+ SetA.SetToString());
		SetA.remove(3);
		assertFalse(3==SetA.length());
		System.out.println("[10, 1000, 10000, 11] " + SetA.SetToString());
		
	}
	@Test
	public void Test009() //unionTest
	{
		SetA.add(0);
		SetA.add(1);
		SetA.add(2);
		SetB.add(3);
		SetB.add(4);
		SetB.add(5);
		System.out.println("Set A: " + SetA.SetToString() + "\nSetB: "  + SetB.SetToString());
		SetA.union(SetB);
		assertEquals("[0, 1, 2, 0, 1, 2, 3, 4, 5]",SetA.SetToString());
		System.out.println(">> Union A&B: "+ SetA.SetToString());
	}
	@Test
	public void Test010() //intersectTest
	{
		SetA.add(0);
		SetA.add(1);
		SetA.add(2);
		SetB.add(3);
		SetB.add(2);
		SetB.add(5);
		System.out.println("Set A: " + SetA.SetToString() + "\nSetB: "  + SetB.SetToString());
		SetA.intersect(SetB);
		System.out.println(">> Intersect A&B: "+ SetA.SetToString());
	}
	
	@Test
	public void Test011()  //IsEmptyTest
	{
		
		assertTrue(SetA.length()==0);
		assertTrue(SetB.length()==0);  	
	
		
	}
	//@Test
	//public void Tets012() //SetToStringTest // Just ignore this since its used elsewhere.
	//{
		
	//}
	
}
