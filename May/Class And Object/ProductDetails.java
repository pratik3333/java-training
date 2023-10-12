import java.util.Scanner;

class Product
{
	private int id;
	private int price;
	private String name;
	
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
	
	 void getProduct()
	{
		for(int i=0; i<product.length; i++)
		{
			
		int id=product[i].getId();
		int price=product[i].getPrice();
		String name=product[i].getName();
		System.out.printf("%d\t%s\t%d\n",id,name,price);
		}
	}
}


public class ProductDetails
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Product product[] = new Product[5];
		ProductRecord pr=new ProductRecord();
		
		for(int i=0; i<product.length; i++)
		{
			product[i]=new Product();
		System.out.println("Enter name id and price of product");
		String name=sc.nextLine();
		int id=sc.nextInt();
		int price=sc.nextInt();
		sc.nextLine();
		
		product[i].setName(name);
		product[i].setId(id);
		product[i].setPrice(price);
		}

		
		pr.setProduct(product);
		pr.getProduct();
	}
}