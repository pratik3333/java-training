package String.Practice.org;
import java.util.*;

public class SeferateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String ns=sc.nextLine();
		
		String s=new String(ns);
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{			char ch=ns.charAt(i);
			
			int asc=(int) ch;
			
			if(asc>=48 && asc<=57)
			{
				sum=sum+(asc-48);
			}
		}
		
		System.out.println("Sum of all number is "+sum);
	}

}
