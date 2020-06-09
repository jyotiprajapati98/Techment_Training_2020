/*
 * calculating age from dob*/

package com.tech.problemStatements;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class YourAge_Ex_49 {

	public static void main(String[] args) throws Exception{

		System.out.print("Enter your DOB in YYYY-MM-DD :");
		Scanner scan=new Scanner(System.in);
		
		String ageInput=scan.nextLine();
		scan.close();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar dob=Calendar.getInstance();
		
		dob.setTime(sdf.parse(ageInput));
		
		System.out.println("Age is "+userAge(dob));
		
	}
	
	//function for calculating age
	public static int userAge(Calendar dob) throws Exception {
		
		Calendar today=Calendar.getInstance();
		int curYear = today.get(Calendar.YEAR); 
        int dobYear = dob.get(Calendar.YEAR); 
        int age = curYear - dobYear; 
        
        //if dob month is previous months then 
        //reduce age by months 
        int curMonth = today.get(Calendar.MONTH); 
        int dobMonth = dob.get(Calendar.MONTH); 
        
        if (dobMonth > curMonth) {
            age--; 

        }
        // for same month, for day 
        else if (dobMonth == curMonth) {
            int curDay = today.get(Calendar.DAY_OF_MONTH); 
            int dobDay = dob.get(Calendar.DAY_OF_MONTH); 
            if (dobDay > curDay) 
            {
                age--; 
            } 

        } 
        return age; 
 

	}

}
