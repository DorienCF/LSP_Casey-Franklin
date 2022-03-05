package org.howard.edu.lsp.assignment5.implementation;

//import java.rmi.Remote;
import java.util.ArrayList;
//import java.util.Set;
import java.util.Set;

public class IntegerSet {
   //private Set<Integer> = set new ArrayList<integer>; // from doc
    private ArrayList<Integer> Set = new ArrayList<>();

   public IntegerSet()
   {

   }
// clears sets
       public void clear() {
           Set.clear();
    
       }
       // fetches the  lenght  of the set
       public int length() {
        int set_length = Set.size();
        return set_length;
           
       }
       
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
       public boolean contains(int value) {
        for(int i = 0; i < length(); i++){
            if(value == Set.get(i)){
                return true;
            }
        }
        return false;
       }

       public int largest(){ // Going to throw a  IntergersetException per  doc if set is empty 
        if(this.length() == 0){
            return 0; // return an error ... 
        }
        int largest = Set.get(0);
        for(int i = 0; i < length(); i++){
            if(largest < Set.get(i)){
                largest = Set.get(i);
            }
        }
        return largest;
       }
       public int smallest(){ // Throws an IntergerSetExecption if set is empmty per doc
        if(this.length() == 0){
            return 0; // return an error ... 
        }
        int smallest = Set.get(0);
        for(int i = 0; i < length(); i++){
            if(smallest > Set.get(i)){
                smallest = Set.get(i);
            }
        }
        return smallest;
       }
       public void add(int value) {
           if(!contains(value)){
            Set.add(value);
           }
       }
       public void remove(int value){
        Set.remove(value);
       }
       public void union(IntegerSet intSetb){
           
        for(int i = 0; i < length(); i++){
            if(!intSetb.contains(Set.get(i)))
            {
                Set.add();
            }
        }
       }
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
       public boolean IsEmpty(){
           boolean EmptyCheck = Set.isEmpty();
           return EmptyCheck;
       }
       public String SetToString(){
           String StringSet  = Set.toString();
           return StringSet;

       }

  
    };




///* 1) Set a private "variable" to  create what a set is 
//* 2.) use the methods native to ArrayList to do Add & remove
//* 3.) use lenght method to determine  the lenghts...duh and use that method innternally for the iteration lenght of loopss
//*
///*