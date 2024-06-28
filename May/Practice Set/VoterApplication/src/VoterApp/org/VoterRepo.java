package VoterApp.org;
import java.util.*;

public class VoterRepo {
	
	ArrayList vlist=new ArrayList();
	
	public void addVoter(VoterModule vm)
	{
		vlist.add(vm);
	}
	
	public void viewVoterDetails()
	{
		
		for(Object obj:vlist)
		{
			VoterModule vmodule=(VoterModule)obj;
			AddressModule amodule=(AddressModule)vmodule.getAddress();
			
			System.out.println(amodule.getDistrict()+"\t"+amodule.getState());
			
			
		}
	}

}
