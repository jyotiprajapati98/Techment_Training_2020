/*
@jyoti
print this
1
12
123
*/
package day2;

public class ForLoopPattern1 {

	public static void main(String[] args) {

		int i,j;
		int n =3;
		
		for(i=1; i<=n; i++) // outer loop for rows
        { 
            
            for(j=1; j<=i; j++) // inner loop for rows
            { 
                // printing num  
                System.out.print(j); 
               
            } 
    
            // ending line
            System.out.println(); 
        } 
	}

}
