
/*
 * In  geometry Heron's formula (sometimes called Hero's formula) 
 * states 
 * that Heron's formula states that the area of a tringle 
 * whose sides have lengths a, b, and c is
where s is the  semi perimeter of the triangle; that is

s=(a+b+c)/2

A=sqrt(s(s-a)(s-b)(s-c))
 * 
 * */
package com.tech.problemStatements;
import java.util.*;
public class HeronsFormula_Ex_44 {

	public static void main(String[] args) {
		double s,area,perimeter;
		System.out.println("enter the side of a triangle");
		Scanner scan=new Scanner(System.in);
		//side
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		perimeter =(a+b+c);
		s=perimeter/2;
		
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle -->"+area);
		

	}

}