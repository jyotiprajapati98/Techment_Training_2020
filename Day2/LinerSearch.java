package day2;
import java.util.*;
public class LinerSearch {

	public static void main(String[] args) {
		
		//initialize variables here
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
		
		System.out.println("list of elements--");
		for(int j=0;j<noOfElements;j++) {
			System.out.print(" "+ list[j]);
		}
		
		/* Liner Searching module start from here*/
		
		System.out.println("Now perform searching --");
		System.out.println("enter element you want to search -");
		
		int key=scan.nextInt();
		
		for(int i=0;i<list.length;i++) {
			if(list[i]==key)
			{
				System.out.print("Searching is successful");
				break;
			}
			else {
				System.out.print("Searching is unsuccessful");
				break;
			}
				
		}
		
		

	}

}
