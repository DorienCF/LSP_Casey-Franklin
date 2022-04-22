package org.howard.edu.lsp.finalExam.junit;
import org.howard.edu.lsp.finalExam.MapUtilities;
import org.howard.edu.lsp.finalExam.NullMapException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class MapUtilitiesTest {
 
		//MapUtilities MapUtil =  new MapUtilities();
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		
	
		MapUtilities MapUtil = new MapUtilities();
		
		
		
		


	
	@Test
	public void Test001 () throws NullMapException {  // empty test
		
		System.out.println("Test 001");
		System.out.println("Value of Common Key Value Pairs:" + MapUtilities.commonKeyValuePairs(map1, map2)+  "\n");
		assertEquals (0,MapUtilities.commonKeyValuePairs(map1, map2));
		
	
		
    	
    	
    	
	}
	@Test
	public void Test002() throws NullMapException {
		
		
		// Adding values into the hash tables
				
				System.out.println("Test 002 " );
				map1.put("Alice", "Healthy");
		    	map1.put("Marry", "Ecastic");
		    	map1.put("Bob", "Happy");
		    	map1.put("Chuck", "Fine");
		    	map1.put("Felix", "Sick");
		    	
		    	map2.put("Marry", "Ecastic");
		    	map2.put("Felix", "Healthy");
		    	map2.put("Ricardo", "Subperb");
		    	map2.put("Tam", "Fine");
		    	map2.put("Bob", "Happy");
		    	
		    	//System.out.println(map1);
		    	
		    	int result = MapUtilities.commonKeyValuePairs(map1, map2);
		    	
		    	assertEquals(2,result);
	}
	}


