package VoterApp.org;
import java.util.*;

public class WardwiseDetails {
	
	
	ArrayList vlist=new ArrayList();
	
	public void wardWiseVoterCount()
	{
		ArrayList wardNoColl=new ArrayList();
		
		System.out.println("Fffffffffffffff");
		
		for(Object obj:vlist)
		{
			System.out.println("........................");
			VoterModule v=(VoterModule)obj;
			AddressModule ad=(AddressModule)v.getAddress();
			
			boolean b=wardNoColl.contains(ad.getWardnum());
			if(!b)
			{
				wardNoColl.add(ad.getWardnum());
				
			}
		}
		
		for(Object obj:wardNoColl)
		{
			Integer wardNo=(Integer)obj;
			System.out.println("Ward NO"+wardNo+"");
			System.out.println("------------------");
			
			for(Object obj1:vlist)
			{
				VoterModule v=(VoterModule)obj;
				AddressModule ad=(AddressModule)v.getAddress();
				
				if(ad.getWardnum()==wardNo)
				{
					System.out.println(v.getName()+"\t"+v.getAge()+"\t"+v.getContact());
					
				}
			}
		}
	}

}
