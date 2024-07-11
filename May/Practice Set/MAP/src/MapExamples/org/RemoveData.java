package MapExamples.org;
import java.util.*;

public class RemoveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		
		map.put(1, "Pratik");
		map.put(2, "Pranit");
		map.put(3, "Nik");
		
		System.out.println("Enter id for remove");
		int id=sc.nextInt();
		
		String name=map.remove(id);
		
		if(name!=null)
		{
			System.out.println("Record deleted succesfully...");
		}
		else
		{
			System.out.println("Record not found");
		}

	}

}
