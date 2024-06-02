package EmployeeData.org;
import java.util.*;

import EmpMain.org.Employee;
import EmployeeHelper.org.EmployeeHelper;

public class Empdata {
	
    Scanner sc=new Scanner(System.in);
    
	ArrayList al=new ArrayList();
	
	public void setEmp(EmployeeHelper employeehelper)
	{
		
		
		al.add(employeehelper);		
	}
	
	public void viewEmp(EmployeeHelper emph)
	{
		Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			EmployeeHelper em=(EmployeeHelper)obj;
			System.out.println(em.getId()+"\t"+em.getSalary()+"\t"+em.getFeedback());
//			System.out.println(em.getName());
			
		}
		
//	   System.out.println(al.isEmpty());
	}
	
}
