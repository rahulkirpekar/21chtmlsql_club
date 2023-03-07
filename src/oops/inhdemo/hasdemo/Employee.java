package oops.inhdemo.hasdemo;

public class Employee 
{
	private int id;
	private String name;
	private String orgName;
	private float salary;
	Address address = new Address();
	
	public static void main(String[] args) 
	{
		Employee e  = new Employee();
		
		e.id=1;
		e.name="Khush";
		e.orgName="Royal";
		e.salary=231456;
		e.address.city="Ahm";
		e.address.state="Guj";
		e.address.country="IND";
		e.address.contactno="324754321";
		e.address.pincode="213456";

		System.out.println(e.id + " " + e.name + " " +e.orgName + " " + e.salary + " " + e.address.city);
		
	}

}
