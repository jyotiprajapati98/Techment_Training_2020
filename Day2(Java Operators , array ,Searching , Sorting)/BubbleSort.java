package day2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
int noOfElements;
		
		System.out.println("Enter the number of list elements");
		
		//take user input by scanner object scan
		
		Scanner scan=new Scanner(System.in);
		
		//using nextInt() for taking integer values 
		noOfElements=scan.nextInt();
		
		// now creating array for storing the elements
		int list[]=new int[noOfElements];
		
		
		//taking user input for list of elements by for loop
		System.out.println("Enter the  list elements");
		for(int i = 0;i < noOfElements ;i++ )
		{
			list[i]=scan.nextInt();
		}
		
		// printing array code is here
		
		System.out.println("list before sorting --");
		for(int j=0;j<noOfElements;j++) {
			System.out.print(" "+ list[j]);
		}
		
		//Bubble sort logic here
		
		int allElements = list.length;  
        int temp = 0;  
         for(int i=0; i < allElements ; i++){  
        	 
                 for(int j=1; j < (allElements-i); j++){ 
                	 
                          if(list[j-1] > list[j]){  
                                 //swap elements  
                                 temp = list[j-1];  
                                 list[j-1] = list[j];  
                                 list[j] = temp;  
                         }  
                          
                 }  
         } 
         System.out.println("Sorted Arry after Bubble Sort");  
         for(int i=0; i < list.length; i++){  
                 System.out.print(list[i] + " ");  
         }  

	}

}
