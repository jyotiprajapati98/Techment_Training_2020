package com.techment.arrayOperations;

import java.util.Scanner;

public class RightRotation {
	
	void rightRotation(int arr[],int times,int size) {
		
		
		for(int i=0;i<times;i++) {
			
			int j,last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--){
				
				//shifting right side
				arr[j]=arr[j-1];
				
			}//close shifting 
			
			arr[0]=last;
		}
		
		System.out.println();
		
	}
	
	void arrayPrint(int array[],int size) {
		
		for(int i=0;i<size;i++) {
			
			System.out.print(" "+array[i]);
		}
		System.out.println();
		
	}

	
	
	public static void main(String[] args) {
		
		RightRotation obj = new RightRotation();
		int array1[]= {1,2,5,6,7,8};
		int size=array1.length;
		
		obj.arrayPrint(array1, size);
		
		//USER ENTER HOW MANY TIME WANNA ROTATE THE ARRAY
		
		System.out.println(" Number of times you wanna rotate array ");
		Scanner scan=new Scanner(System.in);
		int times =scan.nextInt();
				
		obj.rightRotation(array1, times, size);
		
		//print array after rotation 
		obj.arrayPrint(array1, size);
		
		
		
	}

}
