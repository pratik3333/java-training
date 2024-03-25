import java.util.*;

class Rever
{
	String str="My name is pratik";
	
	String a[]=str.split(" ");
	
	public void reverse()
	{
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}


public class ReverseWords{
	
	public static void main(String args[])
	{
		Rever rev=new Rever();
		rev.reverse();
	}
}