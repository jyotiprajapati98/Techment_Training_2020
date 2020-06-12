public class SearchElement{  

   public static void main(String[] args) {  
	        //Initialize array  
	        int  arr[] =  {1, 2, 3, 4, 5};  
	        System.out.println("Elements of given array: ");  
	       
	 //Loop through the array by incrementing value of i  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        } 
	        System.out.println();
	        int searchItem=4;
	        search(arr,searchItem);
	        
	    }  

public static void search(int[] arr,int searchElement) {
	int first=0;
    int last=arr.length-1;;
    
    
    while (last>=first){  //loop untill all elements are traversed
        int mid = (first + last )/2;  //calsulate the mid of elments
        
        if (arr[mid] == searchElement){  //compare mid element with search element
      
     
    	System.out.println(searchElement +" is found at index: "+ mid);

    	  break;
        }  
        if (searchElement > arr[mid]){  //compare mid element is largeer than search element or not 
        	first = mid + 1;
        }else{  
        	last=mid-1;
        }  
    }  
    
    
  
        System.out.println(searchElement +" is not found");    
    
   
}

}  