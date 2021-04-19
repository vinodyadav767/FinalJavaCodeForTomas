/**
 * 
 */
package com.java.hashTable;

import java.util.Hashtable;

/**
 * @author Yadav Vinod, HashTable Example
 *
 */
public class Student3 {
	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable=new Hashtable<String, Integer>();
		hashTable.put("Sohan",1);
		hashTable.put("Satish",2);
		hashTable.put("Saloni",3);
		hashTable.put("Shreya",4);
		hashTable.put("Avinash",5);
		hashTable.forEach((k, v) -> {
			  
            v = v + 100;
            hashTable.replace(k, v);
        });
		hashTable.forEach((k,v)->System.out.print(k+"="+v+" "));
	
	}
}
