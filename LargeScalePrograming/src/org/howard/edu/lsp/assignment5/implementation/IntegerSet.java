package org.howard.edu.lsp.assignment5.implementation;

import java.rmi.Remote;
import java.util.ArrayList;

public class IntegerSet {
   //private Set<Integer> = set new ArrayList<integer>; // from doc
    private ArrayList<Integer> Set = new ArrayList<>();

   public IntegerSet(){

       public void clear(IntegerSet IntsetB) {
           
       }
       public int length() {
        int set_length = Set.size();
        return set_length;
           
       }
       public boolean equals(IntegerSet IntSetB){ // doc says equals(Integeer Set b)
           
       }
       public boolean contains(int value) {
           
       }

       public int largest(){ // Going to throw a  IntergersetException per  doc if set is empty 

       }
       public int smallest(){ // Throws an IntergerSetExecption if set is empmty per doc

       }
       public void add(int value) {
           Set.add(value);

       }
       public void remove(int value){

       }
       public void union(IntegerSet intSetb){

       }
       public void intersect(IntegerSet intSetb){

       }
       public void difference(IntegerSet intSetb){

       }
       public boolean IsEmpty(){
           

       }
       public String SetToString(){

       }

  
    }


}

///* 1) Set a private "variable" to  create what a set is 
//* 2.) use the methods native to ArrayList to do Add & remove
//* 3.) use lenght method to determine  the lenghts...duh and use that method innternally for the iteration lenght of loopss
//*
///*