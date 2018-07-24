package abstractpack;

public class abstractmain1 {

	public static void main(String[] args) {
		
		contract c1 = new contract(1, "John", 25, 22);
	    c1.setnoofhours(130);
	    System.out.println("Lets see what is contractor salary " + c1.computesalary());

	   perm p1 = new perm(2,"Amit",20,22);
	   System.out.println("Lets see what is contractor salary " + p1.computesalary());
	}

}
