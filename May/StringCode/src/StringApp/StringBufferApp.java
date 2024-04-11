package StringApp;

import java.util.*;

class StringBuff
{

	void setString(StringBuffer str,int v)
	{
		System.out.println("Before Appending "+str);
		
		str.append(" "+v);
		System.out.println("After Appending value "+ str);
		
		
	}

	//public void setString(StringBuffer str, int v) {
		// TODO Auto-generated method stub
		
//	}
}


public class StringBufferApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here");
		String str1=sc.nextLine();
		StringBuffer str=new StringBuffer(str1);
		
		System.out.println("Enter value");
		int v=sc.nextInt();
		
		StringBuff sbf=new StringBuff();
		sbf.setString(str, v);
		
		
		
		
	}

}
