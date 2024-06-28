package VoterApp.org;

public class AddressModule {

	private int plotnum;
	private int wardnum;
	private String village;
	private String taluka;
	private String district;
	private String state;
	private int voterid;
	
	public int getPlotnum() {
		return plotnum;
	}
	public void setPlotnum(int plotnum) {
		this.plotnum = plotnum;
	}
	public int getWardnum() {
		return wardnum;
	}
	public void setWardnum(int wardnum) {
		this.wardnum = wardnum;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getVoterid() {
		return voterid;
	}
	public void setVoterid(int voterid) {
		this.voterid = voterid;
	}
}
