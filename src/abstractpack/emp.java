package abstractpack;

public abstract class emp 
{

	int empid;
	String name;
	int hourlyrate;
	int noofdays;
	
	
	
	public emp(int empid, String name, int hourlyrate, int noofdays) {
		 
		this.empid = empid;
		this.name = name;
		this.hourlyrate = hourlyrate;
		this.noofdays = noofdays;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHourlyrate() {
		return hourlyrate;
	}



	public void setHourlyrate(int hourlyrate) {
		this.hourlyrate = hourlyrate;
	}



	public int getNoofdays() {
		return noofdays;
	}



	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}
	
	
	public abstract int computesalary();
	
	 @Override
	    public String toString() {
		 String S1 = "id" + this.empid + "name " + this.name + "noofdays " + this.noofdays +
				 "rate" + this.hourlyrate;
		 
	        return  S1;
	    }
	 
	 
	
}
