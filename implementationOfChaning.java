//https://ide.geeksforgeeks.org/KDAC6BGUrn

// Java program to demonstrate implementation of our 
// own hash table with chaining for collision detection 

import java.util.*;
class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<b; i++){
            table.add(new LinkedList<Integer>());
        }
        
    }
    void insert(Integer key){
        int i = key%BUCKET;
        table.get(i).add(key);
    }
    boolean search(Integer key){
         int i = key%BUCKET;
         return table.get(i).contains(key);
        
    }
    void delete(Integer key){
        int i=key%BUCKET;
        table.get(i).remove(key);
    }
}

class implementationOfChaning {
	public static void main (String[] args) {
	    MyHash mh = new MyHash(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(15));
	    mh.delete(15);
	    System.out.println(mh.search(15));
	
	}
}