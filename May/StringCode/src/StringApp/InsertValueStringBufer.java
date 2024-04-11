package StringApp;
import java.util.*;

public class InsertValueStringBufer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here:--- ");
		String str1=sc.nextLine();
		
		StringBuffer str=new StringBuffer(str1);
		System.out.println("Before conversion "+str);
		
		System.out.println("Start point Index and then string");
		int i=sc.nextInt();
		String s=sc.next();
		str.insert(i, " "+s);
		
		System.out.println("After conversion on string "+str);
		
		
		
	}

}
