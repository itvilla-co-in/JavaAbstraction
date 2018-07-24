package abstractpack;

public class contract extends emp {

	int sal;
	int noofhours;
	
	
	public int getnoofhours() {
		return noofhours;
	}



	public void setnoofhours(int noofhours) {
		this.noofhours = noofhours;
	}
	
	public contract(int empid, String name, int hourlyrate, int noofdays) {
		super(empid, name, hourlyrate, noofdays);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int computesalary() {
		sal = this.hourlyrate * this.noofhours;
		return sal;
	}
	

}
