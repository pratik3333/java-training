package VoterApp.org;
import java.util.*;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		VoterRepo voter=new VoterRepo();
		WardwiseDetails wrd=new WardwiseDetails();
		
		do
		{
			System.out.println("Enter 1 for add Voter");
			System.out.println("Enter 2 for View VoterList");
			System.out.println("Enter 3 for waise wise details");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter id");
				int vid=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter name");
				String name=sc.nextLine();
				
				System.out.println("Enter email");
				String email=sc.next();
				
				System.out.println("Enter contact");
				String contact=sc.next();
				
				System.out.println("Enter age");
				int age=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter gender");
				String gender=sc.next();
				
				VoterModule vm=new VoterModule();
				vm.setVoterid(vid);
				vm.setName(name);
				vm.setEmail(email);
				vm.setContact(contact);
				vm.setAge(age);
				vm.setGender(gender);
				
				
				AddressModule adm=new AddressModule();
				
				sc.nextLine();
				
				System.out.println("Enter plot number");
				int plotnum=sc.nextInt();
				
				System.out.println("Enter ward number");
				int wardnum=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter village name");
				String villagename=sc.next();
				
				System.out.println("Enter taluka name");
				String talukaname=sc.next();
				
				System.out.println("Enter District name");
				String districtname=sc.next();
				
				System.out.println("Enter State name");
				String statename=sc.next();
				adm.setVoterid(vid);
				adm.setPlotnum(plotnum);
				adm.setWardnum(wardnum);
				adm.setVillage(villagename);
				adm.setTaluka(talukaname);
				adm.setDistrict(districtname);
				adm.setState(statename);
				
				vm.setAddress(adm);
				
				voter.addVoter(vm);
				
				
				break;
			case 2:
				voter.viewVoterDetails();
				break;
			case 3:
				wrd.wardWiseVoterCount();
				break;
				
				default:
					System.out.println("Wrong choice");
					break;
			}
			
		}
		while(true);
	}

}
