package gsoft;
import java.util.*;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Product p[]=new Product[5];
		String name;
		int id;
		int price;
		
		for(int i=0; i<p.length;i++)
		{
			System.out.println("Enter name id and price");
			
			name=sc.nextLine();
			id=sc.nextInt();
			price=sc.nextInt();
			sc.nextLine();
			
			p[i]=new Product();
			
			p[i].setName(name);
			p[i].setId(id);
			p[i].setPrice(price);
			
			
		}
		
		
		for(int i=0; i<p.length; i++)
		{
			System.out.print("Name is "+p[i].getName()+"\n");
		}

	}

}
