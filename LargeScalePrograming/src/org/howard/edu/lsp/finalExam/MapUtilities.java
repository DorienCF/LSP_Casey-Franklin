package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map;


public class MapUtilities {
    public static int commonKeyValuePairs( HashMap<String, String> map1, HashMap<String, String> map2)throws NullMapException { //  determine how to properly write the exception
    // implementation
    	
    	
    	
    	
    	Map<String, String> commonMap = new HashMap<String, String>();
    	
    	/// Building the Hash maps:
    	
    	
    
    	
    	if (map2 == null && map1 == null) { 
    		return 0;		
    		} // just returning 0 if both maps  are empty
    	else {

    	for(String key : map1.keySet()) 
    		{ 
    			if(map2.get(key) !=null )
    				{  
    					if(map1.get(key).equals(map2.get(key)))
    						{ // looping  through maps 1 & 2 if they have the same key values then the values are stored in the commanMap hashMap
    							commonMap.put(key, map1.get(key));
    							}	
    				}
    							}
    		
    	return  commonMap.size(); // returns the number of common Key values
    } 
    
    }
 }

    
 

	

