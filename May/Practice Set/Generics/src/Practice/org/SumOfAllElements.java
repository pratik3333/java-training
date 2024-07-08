package Practice.org;
import java.util.*;

public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(600);
		al.add(400);
		al.add(300);
		
		int sum=0;
		
		for(Integer obj:al)
		{
			sum=sum+obj;
		}
	
		System.out.println("Sum of all elements is "+sum);
	}

}
