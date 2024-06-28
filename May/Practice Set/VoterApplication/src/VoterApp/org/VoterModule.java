package VoterApp.org;


public class VoterModule {
	

	private int voterid;
	private String name;
	private String email;
	private String contact;
	private int age;
	private String gender;
	AddressModule address;
	
	
	public int getVoterid() {
		return voterid;
	}
	public void setVoterid(int voterid) {
		this.voterid = voterid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public AddressModule getAddress() {
		return address;
	}
	public void setAddress(AddressModule address) {
		this.address = address;
	}
	
	
	
	
}
