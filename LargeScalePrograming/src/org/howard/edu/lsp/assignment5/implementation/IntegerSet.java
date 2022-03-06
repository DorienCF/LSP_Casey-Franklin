package org.howard.edu.lsp.assignment5.implementation;
//import java.rmi.Remote;
	import java.util.ArrayList;
	//import java.util.Set;
	//import java.util.Set;

	public class IntegerSet {
	   //private Set<Integer> = set new ArrayList<integer>; // from doc
	    private ArrayList<Integer> Set = new ArrayList<>();

	 //
	    public class IntegerSetException  extends Exception
	    {
	        public IntegerSetException (String s)
	        {
	            // Call constructor of parent Exception
	            super(s);
	        }
	    }
	     
	    
	
	       public void clear() {
	           Set.clear();
	    
	       }
	       // fetches the  lenght  of the set
	       public int length() {
	        int set_length = Set.size();
	        return set_length;
	           
	       }
	       // equals: Complete
	       public boolean equals(IntegerSet IntSetB){ // doc says equals(Integeer Set b)
	           if(length() == IntSetB.length())
	           {
	               return false;
	           }
	           for(int i = 0; i < length(); i++)
	           {
	                if(!IntSetB.contains(Set.get(i)))
	                {
	                    return false;
	                }
	           }
	           return true;
	       }
	       // contains: Complete
	       public boolean contains(int value) {
	        for(int i = 0; i < length(); i++){
	            if(value == Set.get(i)){
	                return true;
	            }
	        }
	        return false;
	       }
	       //largest: complete
	       public int largest() throws IntegerSetException{ // Going to throw a  IntergersetException per  doc if set is empty 
	        if(this.length() == 0){
	            throw new IntegerSetException("Set is empty"); // return an error ... 
	        }
	        int largest = Set.get(0);
	        for(int i = 0; i < length(); i++){
	            if(largest < Set.get(i)){
	                largest = Set.get(i);
	            }
	        }
	        return largest;
	       }
	       // smallest: complete
	       public int smallest() throws IntegerSetException { // Throws an IntergerSetExecption if set is empmty per doc
	        if(this.length() == 0){
	            throw new IntegerSetException("Set is empty"); // return an error ... 
	        }
	        int smallest = Set.get(0);
	        for(int i = 0; i < length(); i++){
	            if(smallest > Set.get(i)){
	                smallest = Set.get(i);
	            }
	        }
	        return smallest;
	       }
	       // add: Complete
	       public void add(int value) {
	           if(!contains(value)){
	            Set.add(value);
	           }
	       }
	       // remove: complete
	       public void remove(int value) throws IntegerSetException {
	    	   if (this.length()==0) {
	    		   throw new IntegerSetException("Set is Empty");
	    	   }
	        Set.remove(value);
	       }
	       //Union
	       public void union(IntegerSet intSetb){
	           
	        for(int i = 0; i < length(); i++){
	            if(!intSetb.contains(Set.get(i)))
	            {
	                Set.add(i);
	            }
	        }
	       }
	       //Intersect: 
	       public void intersect(IntegerSet intSetb){
	        for(int i = 0; i < length(); i++){
	            if(!intSetb.contains(Set.get(i)))
	            {
	                Set.remove(i);
	            }
	        }
	       }
	       public void difference(IntegerSet intSetb){

	       }
	       //IsEmpty Complete:
	       public boolean IsEmpty(){
	           boolean EmptyCheck = Set.isEmpty();
	           return EmptyCheck;
	       }
	       // SetToString :Complete
	       public String SetToString(){
	           String StringSet  = Set.toString();
	           return StringSet;

	       }
		
	  
	    };





