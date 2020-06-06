package com.tech.problemStatements;
import java.util.*;

 class Product{
	
	private int product_id;
	private String product_name;
	private float product_price;
	
	//getting id
	public int gettingID() {
		 return product_id;
	}
	
	//setting it
	public void settingID(int id){
		this.product_id=id;
	}
	
	//get product name
	public String getProductName() {
		
		return product_name;
	}
	
	//setting product name
	public void setProductName(String name) {
		
		this.product_name=name;
	}
	
	
	//get product price
	public float getProductPrice() {
		return product_price;
	}
	
	//set product price
	public void setProductPrice(float price) {
		this.product_price=price;
	}
	
}
public class ProductCatalogue {

	public static void main(String[] args) {
		//main code is here
		
		Scanner scan=new Scanner(System.in);
		
		//productlist that is type of ArrayList
		ArrayList<Product> productList =new ArrayList<Product>();
		
		System.out.println(" number of product you want to add ?");
		
		int number=scan.nextInt();
		
		System.out.println(" enter product details");
		
		//loop is here 
		for(int i=1;i<=number;i++) {
			
			//take id
			System.out.println(" enter product id for "+i);
			int pid=scan.nextInt();
			
			//take name
			System.out.println(" enter product name");
			String pname=scan.next();
			
			//take price
			System.out.println("enter product price");
			float pprice=scan.nextFloat();
			
			//create product object
			
			Product p=new Product();
			
			//call methods
			p.settingID(pid);
			p.setProductName(pname);
			p.setProductPrice(pprice);
			
			productList.add(p);
		}
		
		//for display
		System.out.println("enter the id for finding the details");
		
		int find =scan.nextInt();
		
		System.out.print(" "+find);
		//indecator
		boolean found=false;
		
		//for loop for finding the details
		
		//product --arraylist
		//p is object of product
		//productlist is arraylist type list
		
		for(Product p:productList) {
			
			if(p.gettingID()==find) {
				
				System.out.println( "product is exist, id is - "+p.gettingID());
				
				System.out.println("product name is - "+p.getProductName());
				
				System.out.println("product price is -"+p.getProductPrice());
				
				//set the boolean value of found
				
				found =true;
				
				//break if product is found
				
				//System.out.println("product is found");
				break;
			}
		}
		
		//if product is not found then
		if(found==false) {
			
			System.out.println(" Product is not exist try something else");
		}
		
	
		
	}

}