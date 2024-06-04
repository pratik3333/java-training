package GroceryHelper.org;

import java.util.*;
import Grocery.org.Module.*;
import Grocery.org.Module.Module;

public class GroceryHelper {

	ArrayList list=new ArrayList();
	public void setProduct(Module module)
	{
		
		list.add(module);
	}
	public void viewAllProduct()
	{
		Iterator i=list.iterator();
		
		for(Object obj:list)
		{
			Module mm=(Module)obj;
			
			System.out.println(mm.getPname());
		}
		
//		Iterator ii=li.iterator();
//		for(Object obj:li)
//		{
//			System.out.println(obj);
//		}
	}
	
	ArrayList li;
	
	public void addDescrioption(String desc)
	{
		
		if(li==null)
		{
			li=new ArrayList();
			li.add( desc);
//			li.add(,desc);
			
		}
		else
		{
			li.add(desc);
		}
		
		
	}
	
	
}
