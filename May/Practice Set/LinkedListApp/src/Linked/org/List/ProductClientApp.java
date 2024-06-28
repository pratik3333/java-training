package Linked.org.List;
import java.util.*;

public class ProductClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ProductHelper ph=new ProductHelper();
		
		do
		{
			System.out.println("Enter 1 for adding new Product");
			System.out.println("Enter 2 for view products");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter product id");
				int id=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Product name");
				String pname=sc.nextLine();
				
				System.out.println("Enter product price");
				int price=sc.nextInt();
				ProductModule product=new ProductModule();
				
				product.setId(id);
				product.setPname(pname);
				product.setPrice(price);
				sc.nextLine();
				
				System.out.println("Enter product manufacturing month");
				String mgmonth=sc.nextLine();
				
				System.out.println("Enter product Expire month");
				String exmonth=sc.nextLine();
				
				ProductDetails pd=new ProductDetails();
				pd.setMgmonth(mgmonth);
				pd.setExmonth(exmonth);
				pd.setId(id);
		
				product.setPd(pd);
				ph.addProduct(product);
				
				break;
				
			case 2:
				ph.viewProduct();
				break;
				default:
					System.out.println("Wrong Input");
			}
		}
		while(true);
	}

}
