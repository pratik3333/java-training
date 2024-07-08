package LinkedHashMap.Within.LinkedHashMap.org;
import java.util.*;

public class Repository {

	LinkedHashMap<String,LinkedHashMap<Integer,Model>> outer=new LinkedHashMap<String,LinkedHashMap<Integer,Model>>();
	
	LinkedHashMap<Integer,Model> inner=new LinkedHashMap<Integer,Model>();

	public void addDepartment(String depa,LinkedHashMap<Integer,Model> desc)
	{
		outer.put(depa, desc);
	}
}
