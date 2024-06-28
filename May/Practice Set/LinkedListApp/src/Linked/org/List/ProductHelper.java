package Linked.org.List;
import java.util.*;

public class ProductHelper {

	LinkedList li=new LinkedList();
	
	public void addProduct(ProductModule product)
	{
		li.add(product);
	}
	
	public void viewProduct()
	{
		for(Object obj:li)
		{
			ProductModule pm=(ProductModule)obj;
			
			ProductDetails pd=(ProductDetails)pm.getPd();
			
			System.out.println(pm.getId()+"\t"+pm.getPname()+"\t"+pm.getPrice()+"\t"+pd.getMgmonth()+"\t"+pd.getExmonth());
			
		
		}
	}
}
