

package day2;

import java.util.Scanner;

public class BinarySearch {

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
		
		System.out.print("list of elements--");
		for(int j=0;j<noOfElements;j++) {
			System.out.print(" "+ list[j]);
		}
		
		//Bubble search performing here -
		System.out.println();
		System.out.println("enter element you want to search -");
		int key=scan.nextInt();
		
		int first=0;
		int last=list.length-1; //calculating last element 
		
		int mid = (first + last)/2; 
		
		   while( first <= last ){
			   
		      if ( list[mid] < key ){ 
		    	  
		        first = mid + 1;     
		      }
		      else if ( list[mid] == key ){  
		        System.out.println("key is found");  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Key is not found!");  
		   }  
		

	}

}
