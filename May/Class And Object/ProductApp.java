import java.util.*;


class Product
{
	private int id;
	private String name;
	private int price;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	
}

class Store
{
	private Product prod[];
	private int i;
	
	public void setProduct(Product P[])
	{
		prod=P;
	}
	
	public int getProduct(int sid)
	{
		boolean flag = false;
		for(int i=0; i<prod.length; i++)
		{
			if(prod[i].getId==sid)
			{
				flag= true;
				break;
			}
		}
		if(flag)
		{
			return prod[i];
		}
		else
		{
			return null;
		}
	}
}


public class ProductApp
{
	private int id;
	private int price;
	private String name;
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Product p[]=new Product[5];
		Store s=new Store();
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter Product name id and price");
			
			String name=sc.nextLine();
			int id =sc.nextInt();
			int price =sc.nextInt();
			sc.nextLine();
			p[i]=new Product();
			
			p[i].setName(name);
			p[i].setId(id);
			p[i].setPrice(price);
		}
		
		s.setProduct(p);
		System.out.println("Enter Search Id");
		int sid = sc.nextInt();
		
		Product p1=s.getProduct(sid);
		if(p1[i]!=null)
		{
			System.out.println("Product Found");
			System.out.printf("%d %s %d",p1.getId(),p1.getName(),p1.getPrice());
		}
		else
		{
			System.out.println("Product not found");
		}
	}
	
}