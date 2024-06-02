package ShreeKrushna.org;
import java.util.*;



public class CollectionMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<Integer, CollectionPojo> map=new LinkedHashMap<Integer, CollectionPojo>();
		
//		CollectionPojo c=new CollectionPojo();
		 CollectionPojo[] c=new CollectionPojo[2];
//		 CollectionPojo c=new CollectionPojo();
		
		do {
			
			System.out.println("Press 1: Add new Student data");
			System.out.println("Press 2: View all students data");
			System.out.println("Press 3: Search student data by name");
			System.out.println("Press 4: Search student data by PRN number");
			System.out.println("Press 5: Delete stiudent by course name");
			System.out.println("Press 6: Find the course wise student data");
			System.out.println("Press 7: Fimd tje course wise stidemt count");
			System.out.println("Press 8: Arrange student count course wise in descendingn order");
			
			System.out.println();
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
//			System.out.println();
			
			int id;
			String name;
			String courseName;
			int totalFees;
			int duration;
			
			switch(choice)
			{
			case 1:	
//				System.out.println("Enter PRN number of student");
//				Integer prn=sc.nextInt();
//				
//				System.out.println("Enter id, name,course name, total fee and duration in months");
//				id=sc.nextInt();
//				name=sc.nextLine();
//				courseName=sc.nextLine();
//				sc.nextLine();
//				totalFees=sc.nextInt();
//				duration=sc.nextInt();				
				
//				c=new CollectionPojo();
				for(int i=0; i<c.length; i++)
				{
					System.out.println("Enter PRN number of student");
					Integer prn=sc.nextInt();
					
					System.out.println("Enter id, name,course name, total fee and duration in months");
					id=sc.nextInt();
					name=sc.nextLine();
					courseName=sc.nextLine();
					sc.nextLine();
					totalFees=sc.nextInt();
					duration=sc.nextInt();				
					
					c[i]=new CollectionPojo();
					
				c[i].setId(id);
				c[i].setName(name);
				c[i].setCourseName(courseName);
				c[i].setTotalFees(totalFees);
				c[i].setDuration(duration);
				map.put(prn, c[i]);
				
				}
				
				
				
				break;
				
			case 2:
				
				Set<Map.Entry<Integer, CollectionPojo>> set=map.entrySet();
				
				for(Map.Entry<Integer, CollectionPojo> m:set)
				{
					System.out.println();
					System.out.println("PRN number is "+m.getKey());
//					System.out.println(m.getValue());
				for(int i=0; i<c.length;i++)
						
					{
					System.out.println("Id is   "+c[i].getId() +"\t"+"name is "+c[i].getName()+"\t"+"course name is"+c[i].getCourseName()+"\t"+"total fees"+c[i].getTotalFees()+"\t"+"duration is"+"\t"+c[i].getDuration());
					}
					
				}
				
				System.out.println();
				
				break;
				
			case 3:
			
				CollectionPojo k=new CollectionPojo();
				sc.nextLine();
				System.out.println("Enter search name");
				String sname=sc.nextLine();
				
//				boolean b=map.containsValue(k.getCourseName()==sname);
				
//				boolean b=k.getCourseName()==sname;
				System.out.println("i am search name "+sname);
//			map.getClass()
				for(int i=0; i<c.length;i++)
					
				{
				
				if(c[i].getCourseName().equals(sname))
				{
					System.out.println("Student record found" + c[i].getCourseName());
					break;
					
					
				}
				
				else
				{
					System.out.println("Student record not found " + c[i].getCourseName() +" i am search name "+sname);
				}
				}
				break;
			
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			}
			
		}
		while(true);
	}

}
