/**
 * 
 */
package com.java.multithreading;

/**
 * @author Yadav Vinod, Garbage Collection, Runtime freeMemory() and totalMemory()
 *
 */
public class Student14 {
	public static void main(String[] args) throws Exception {
		Runtime runTime=Runtime.getRuntime();
		System.out.println("Total Memory: "+runTime.totalMemory());
		System.out.println("Total Free Memory: "+runTime.freeMemory());
		for(int i=0;i<15000;i++)
		{
			new Student14();
		}
		System.out.println("After creating 15000 instance, Total free Memory: "+runTime.freeMemory());
		System.gc();  
		System.out.println("Now After gc() call, Total free Memory: "+runTime.freeMemory());
	}
}
