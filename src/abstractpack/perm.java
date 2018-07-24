package abstractpack;

public class perm extends emp {
	
	public perm(int empid, String name, int hourlyrate, int noofdays) {
		super(empid, name, hourlyrate, noofdays);
		// TODO Auto-generated constructor stub
	}

	int sal;

	@Override
	public int computesalary() {
		sal = this.hourlyrate * this.noofdays * 8;
		return sal;
	}
	

	
}
