/* program is for 
 * left rotation */

package com.techment.arrayOperations;

import java.util.Scanner;

public class LeftArrayRotation {
	
	//left rotation function
	
	void RotationFun(int array[],int times,int size) {
		
		for(int i=0;i<times;i++) {
			
				int j,first;
			
				//now assign array[0] to first 
				first=array[0];
				
				//now loop for shifting the elements by 1 
				for(j =0;j<array.length-1;j++) {
					
					array[j]=array[j+1]; //shifting elements
					
				}//shifting loop is close
			
			
				// first added to last 
				array[j] =first;
			
		}//for loop close 
		
		System.out.println(" ");
	}//close of rotation function 
	
	
	// right rotation 
	
	
	//function for printing array 
	
	void arrayPrint(int array[],int size) {
		for(int i =0;i<array.length;i++) {
			
			System.out.print("  "+array[i]);
		}
		
		System.out.println("");
	}
	
	
	//main function is here 

	public static void main(String[] args) {
		
		// creating object of the for accessing methods 
		LeftArrayRotation rotationObject = new LeftArrayRotation();
		
		int array[]= {10,20,30,40,50};
		
		int sizeOfArray=array.length;
		
		//print the array 
		
		System.out.print("Your array is --->");
		
		//left rotate is a object for accessing  using dot(.) operator
		
		rotationObject.arrayPrint(array,sizeOfArray);
		
		//left rotation of array 
		System.out.println("Number of time you want to rotate the array -");
		
		Scanner scan=new Scanner(System.in);
		int rotate =scan.nextInt();
		
		rotationObject.RotationFun(array,rotate,sizeOfArray);
		
		System.out.println(" After "+ rotate + "  times left rotation ,Array will be -->");
		
		rotationObject.arrayPrint(array,sizeOfArray);
		
		
	}

}
