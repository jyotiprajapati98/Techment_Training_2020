/*
 *             Once King of Dholokpur has constructed a  glass house for the prince.
 *              This glasshouse consists of 18 doors numbering 1, 2, 3 …18. 
On one fine day when prince was playing hide & seek with his friends 
he went inside this glass house and was struggling to come out of the glass 
house since all the doors look similar.
 None other than the king know the solution to this complex problem. 

Based on the location of the prince, 
the king announces the solution 
“The sum of the digits of a two digit number,
 would lead you out of the glass house”

Solution : Write a generic program which accepts a two digit 
number and find the exit door number of the glasshouse.
*/
import java.util.*;
public class GlassHouse {
	public static void main(String[] args) {
		
		//local variables declare
		int doorNumber,doorKey=0,temp;
		
		System.out.println("Enter two digit for key generation :");
		
		//taking input by scanner class object
		
		Scanner s=new Scanner(System.in);
		
		//nextInt is taking next integer value
		doorNumber=s.nextInt();
		
		//while loop condition checking to make sure number not 0
		while(doorNumber>0)
		{
			// doornumber % 10 is giving last digit 
			temp = doorNumber % 10;
			
			//adding last digit value to doorkey
			doorKey=doorKey+temp;
			
			//here / is giving fisrt digit 
			doorNumber=doorNumber /10;
		}
		//print the final output
		System.out.println("The exit door of glass house is -->"+doorKey);
			
	}
	

}
