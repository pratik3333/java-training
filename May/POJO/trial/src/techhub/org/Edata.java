package techhub.org;

public class Edata {
	
	
	
		protected String name;
		protected int id;
		protected int salary;
		
		public Edata()
		{
			
		}
		
		public Edata(String name, int id, int salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
	

}
