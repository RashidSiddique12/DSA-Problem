
//https://ide.geeksforgeeks.org/OeTSY5boeF

import java.io.*;

class MyHash{
        int []arr;
	    int cap, size;
	    
	    MyHash( int c){
	        cap = c;
	        size = 0;
	        arr = new int[c];
	        for(int i=0; i<c; i++){
	            arr[i] = -1;
	            
	       }
	        
	   }
	   int hash(int key){
	       return key % cap;
	   }
       // insertion of an elements
	   boolean insert(int key){
	       if(size == cap){
	           return false;
	       }
	       int i = hash(key);
	       while(arr[i] != -1 && arr[i] != -2 && arr[i]!= key){ // liner probing find vacant space to store the value
	           i = (i+1)%cap;
	       }
	       if(arr[i]==key) return false;
	       else{
	           arr[i] = key;
	           size++;
	           
	           return true;
	       }
	   }
       //Searching of an element
	   boolean search(int key){
	       int h = hash(key);
	       int i = h;
	       while(i!=-1){
	           if(arr[i] == key) return true;
	           i = (i+1)%cap;
	           
	           if(i==h) return false;
	           
	       }
	       return false;
	   }
       //Erasing of an element
	   boolean erase(int key){
	       int h = hash(key);
	       int i = h;
	       while(i!=-1){
	           if(arr[i] == key) {
	               arr[i] = -2;
	               return true;
	           }
	           
	           i = (i+1)%cap;
	           
	           if(i==h) return false;
	           
	       }
	       return false;
	       
	   }
       // Printing of an element
	   void printSet(){
	       for(int e : arr){
	           System.out.print(e + " ");
	       }
	   }
    
}

public class implementationOfOpenAddressing {
	public static void main (String[] args) {
	    MyHash mh = new MyHash(7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56) == true){
	        System.out.println("Present in the Array");
	    }
	    else{
	        System.out.println("Not in the Array");
	    }
	    
	    mh.erase(56);
	    
	    if(mh.search(56) == true){
	        System.out.println("Present in the Array");
	    }
	    else{
	        System.out.println("Not in the Array");
	    }
	    mh.printSet();
	    
		
	}
}