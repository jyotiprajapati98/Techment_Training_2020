package com.tech.assessment1;

public class OddEven{
	
		public static void main(String args[])
		{
			int array[]={2,6,7,9,4};
			int even=0,odd=0;
			
			for(int i=0;i<array.length;i++){
				if(array[i] % 2 == 0)
					even=even+array[i];
				else
					odd=odd+array[i];
		
			}
			System.out.println(" even "+even);
			System.out.println(" odd"+odd);

		}
	
}
