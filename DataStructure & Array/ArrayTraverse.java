
//import packages here 
package com.techment.arrayOperations;
import java.util.*;

public class ArrayTraverse {

	public static void main(String[] args) {
			//size of array 
			int sizeOfArray;
			
			//taking input by user via scanner class
			
			System.out.println("enter size of array-");

			Scanner scan = new Scanner(System.in);
			sizeOfArray = scan.nextInt();
			int array[] = new int[sizeOfArray];
			
			//take elements for array 
			System.out.println("enter elements  of array-");
			
			for(int i =0;i<array.length;i++) {
				
				array[i] =scan.nextInt();
			}
			
			//printing the array 
			System.out.print("your array is --->");
			
			for(int i =0;i<array.length;i++) {
				
				System.out.print("  "+array[i]);
			}
			
		
	}

}
