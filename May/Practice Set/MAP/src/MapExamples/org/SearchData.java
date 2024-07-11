package MapExamples.org;
import java.util.*;


public class SearchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer, String>();
		
		map.put(1, "pratik");
		map.put(2, "Kunal");
		map.put(3, "pranit");
		map.put(4, "nik");
		
		System.out.println("Enter id for search ");
		int id=sc.nextInt();
		
		String name=map.get(id);

		if(name!=null)
		{
			System.out.println("Data found");
			System.out.println("Id is "+id+" name is "+name);
		}
		else
		{
			System.out.println("Data not found");
		}
		
	}

}
