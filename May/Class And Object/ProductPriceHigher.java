import java.util.Scanner;


class Product
{
	private String name;
	private int id;
	private int price;
    
     public void setId(int id)
	 {
		 this.id=id;
	 }	 
	 public int getId()
	 {
		 return id;
	 }
	 
	 public void setPrice(int price)
	 {
		 this.price=price;
	 }
	 public int getPrice()
	 {
		 return price;
	 }
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
}

class ProductRecord
{
	private Product []product;
	
	public void setProduct(Product []product)
	{
		this.product=product;
	}
	public void getProduct()
	{
		System.out.println("Below products are higher than 300");
		for(int i=0; i<product.length; i++)
		{
			if(product[i].getPrice()>300)
			{
				int id=product[i].getId();
				int price=product[i].getPrice();
				String name=product[i].getName();
				
				System.out.printf("%d\t%s\t%d\n",id,name,price);
			}
		}
	}
}

public class ProductPriceHigher
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Product []product=new Product[5];
		ProductRecord pr=new ProductRecord();
		
		for(int i=0; i<product.length; i++)
		{
			System.out.println("Enter product name id and Price");
			
			String name=sc.nextLine();
			int id=sc.nextInt();
			int price=sc.nextInt();
			sc.nextLine();
			
			product[i]=new Product();
			
			product[i].setName(name);
			product[i].setId(id);
			product[i].setPrice(price);
		}
		
		pr.setProduct(product);
		pr.getProduct();
	}
}