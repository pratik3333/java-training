package String.Practice.org;
import java.util.*;

public class CountEveryWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		
		
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String, Integer>();
		String []words=s.split(" ");
		
		for(int i=0; i<words.length;i++)
		{
			Integer len=map.get(words[i]);
			
			if(len==null)
			{
				len=new Integer(0);
			}
			len=words[i].length();
			map.put(words[i], len);
			
		}
		
		Set<Map.Entry<String, Integer>> data=map.entrySet();
		
		for(Map.Entry<String, Integer> d:data)
		{
			System.out.println(d.getKey()+"       "+d.getValue());
		}
	}

}
