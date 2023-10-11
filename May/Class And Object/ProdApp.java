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
	private Product product;
	
	public void setProduct(Product product)
	{
		this.product=product;
	}
	public void getProduct()
	{
		int id=product.getId();
		int price=product.getPrice();
		String name=product.getName();
		
		System.out.printf("%d\t%s\t%d",id,name,price);
	
	}
}


public class ProdApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Product product=new Product();
		ProductRecord pr=new ProductRecord();
		
		System.out.println("Enter product name id price");
		
		String name=sc.nextLine();
		int id=sc.nextInt();
		int price=sc.nextInt();
		
		product.setName(name);
		product.setId(id);
		product.setPrice(price);
		
		pr.setProduct(product);
		pr.getProduct();
		
		
	}
}