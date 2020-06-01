/* @jyoti
 * */
package com.techment.datastructure;

import java.util.Scanner;

public class SelectionSort {
	
	//printing array
	void printArray(int array[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort obj =new SelectionSort();
		
		//number of elements in array
		System.out.println(" number of elements you want --");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		//initialize array 
		int array[]=new int[n];
		int size = array.length;
		
		System.out.println(" Enter Elements --");
		
		for(int i=0;i<size;i++) {
			
			array[i]=scan.nextInt();
		}
		
		System.out.println("Elements --");
		
		obj.printArray(array, size);
		

	}

}
