import java.util.Scanner;

class Bill
{
	private int qty;
	private int rate;
	private int id;
	private String name;
	
	
	void setQty(int qty)
	{
		this.qty=qty;
	}
	int getQty()
	{
		return qty;
	}
	
	void setRate(int rate)
	{
		this.rate=rate;
	}
	int getRate()
	{
		return rate;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
}

class BillRecord
{
	private Bill []bill;
	private int s=0;
	
	void setBill(Bill []bill)
	{
		this.bill=bill;
	}
	
	void displayBill()
	{
		int total=0;
		System.out.printf("id\tname\tqty\trate\ttotal\n");
		for(int i=0; i<bill.length; i++)
		{
			String name=bill[i].getName();
			int qty=bill[i].getQty();
			int rate=bill[i].getRate();
			int id = bill[i].getId();
			
			total=(qty)*(rate);
			
			System.out.printf("%d\t%s\t%d\t%d\t%d\n",id,name,qty,rate,total);
			s=total+s;
		}
		System.out.printf("Total bill is %d",s);
	}
}


public class BiscuitBillApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		
		Bill bill[]=new Bill[3];
		BillRecord br= new BillRecord();
		
		for(int i=0; i<bill.length; i++)
		{
			
			
			System.out.println("Enter Product name Quantity and Rate and Id");
			
			String name=sc.nextLine();
			int qty=sc.nextInt();
			int rate=sc.nextInt();
			int id=sc.nextInt();
			sc.nextLine();
			
			bill[i]=new Bill();
			
			bill[i].setId(id);
			bill[i].setName(name);
			bill[i].setQty(qty);
			bill[i].setRate(rate);
			
		}
		br.setBill(bill);
        br.displayBill();		
	}
}