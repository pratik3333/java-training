package PlayerData.org;

public class Model {
	
	private String name;
	private int age;
	private int run;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ "+ name +"\t"+age+"\t"+run+"]"; 
	}
}
