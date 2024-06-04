package Grocery.App.org;
import java.util.*;

import GroceryHelper.org.GroceryHelper;
import Grocery.org.Module.*;
import Grocery.org.Module.Module;

public class GroceryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroceryHelper gh=new GroceryHelper();
		Scanner sc=new Scanner(System.in);
		
		
		do {
			
			System.out.println("Enter 1 for adding product");
			System.out.println("Enter 2 for view All products");
			System.out.println("Enter 3 for add description about product");
			System.out.println("Enter choice");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter product id");
				int pid=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter product name");
				String pname=sc.nextLine();
				
				System.out.println("Enter product cost price");
				int costprice=sc.nextInt();
				
			Module modul=new Module();
			
			modul.setPid(pid);
			modul.setPname(pname);
			modul.setCostprice(costprice);
			
			gh.setProduct(modul);
				
				
				break;
			case 2:
				gh.viewAllProduct();
				
				break;
				
				
				
				case 3:
					sc.nextLine();
					System.out.println("Add Description about product");
					String desc=sc.nextLine();
					
//					Module mod=new Module();
//					System.out.println("Enter id");
//					int id=sc.nextInt();
					gh.addDescrioption(desc);

					break;
					default:
						System.out.println("Wrong choice");
			}
			
		}
		while(true);
	}

}
