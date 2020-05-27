
/*
 * enter the number of subjects and their marks then display the - 
 * 1 total marks
 * 2 minimum subject mark
 * 3 maximum marks
 * 4 number of pass subjects 
 * 5 number of fail subjects */
package day2;

import java.util.*;
public class PassFail {

	public static void main(String[] args) {
		int noOfSubject,total=0;
		int minMarks,maxMarks;
		
		System.out.println("enter the number of subjects");
		Scanner scan=new Scanner(System.in);
		noOfSubject = scan.nextInt();
		
		int marks[]=new int[noOfSubject];
		System.out.println("enter marks of subjects");
		for(int i=0;i<noOfSubject;i++) {
			
			System.out.println("marks for subject : "+ i);
			marks[i]=scan.nextInt();
			total=total+marks[i];
		}
		System.out.println("Total Marks you obtained: " +total);
		
		minMarks = maxMarks=marks[0];
		for(int j=0;j<noOfSubject;j++) {
			if(marks[j]<minMarks)
			{
				minMarks=marks[j];
			}
			else {
				maxMarks=marks[j];
			}
			
		}
		
		int pass[]=new int[noOfSubject];
		int fail[]=new int[noOfSubject];
		int p=0,f=0;
		for(int i=0;i<noOfSubject;i++)
		{
			if(marks[i]>=50)
			{
				pass[i]=marks[i];
				p=p+1;
				System.out.println("In subject "+i +"you will pass");
				
			}
			else {
				pass[i]=marks[i];
				f=f+1;
				System.out.println("In subject "+i +" you will fail");
			}
		}
		System.out.println("Number of pass subjects : " +p);
		System.out.println("Number of fail subjects: " +f);
		
		
		System.out.println("Minimum Marks: "+minMarks);
		System.out.println("Maximum Marks: "+maxMarks);
		
		
		
		
	}

}
