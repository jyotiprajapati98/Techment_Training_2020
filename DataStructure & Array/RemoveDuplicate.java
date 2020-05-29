package com.techment.arrayOperations;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int array[]= {1,3,4,5,6,3,4,5,6,8};
		
		System.out.println(" Given array is  ");
		
		// array printing
		for(int j=0;j<array.length-1;j++) {
			
			System.out.print(" "+array[j]);
		}
		
		
		System.out.println(" ");
		
		
		// removing the duplicate elements from array 
		
		int n = array.length;
		
		/*
		 * remove duplicate elements from array*/
		for(int i =0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				//check duplicates, replace the elements
				//by other elements
				
				if(array[i]==array[j]) {
					
					array[j]=array[n-1];
					n--;
					j--;
				}
					
					
			}
		}
		System.out.println(" After removing duplicates");
		for(int j=0;j<n;j++) {
			
			System.out.print(" "+array[j]);
		}
		
	}
	

}
