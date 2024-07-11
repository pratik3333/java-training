package MapExamples.org;
import java.util.*;
import java.util.Map.Entry;

public class MapWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<String,ArrayList> map=new LinkedHashMap<String,ArrayList>();
		
		ArrayList india=new ArrayList();
		
		india.add("virat");
		india.add("Vira");
		india.add("Rohit");
		india.add("Dhoni");
		
		ArrayList aus=new ArrayList();
		
		aus.add("Marck");
		aus.add("abx");
		aus.add("manadfc");
		aus.add("asnd");
		
		map.put("India", india);
		map.put("Austrolia", aus);
		
		
		Set<Entry<String, ArrayList>> data=map.entrySet();
		
		

		for(Map.Entry<String,ArrayList> d:data)
		{
			String name=d.getKey();
			
			ArrayList al=d.getValue();
			
			System.out.println(name);
			System.out.println(al);
//			for(Object playerlist:al)
//			{
//				System.out.println(al);
//			}
		}
	}

}
