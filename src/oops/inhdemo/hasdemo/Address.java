package oops.inhdemo.hasdemo;

public class Address 
{
	String city     ;
	String state    ;
	String country  ;
	String contactno;
	String pincode  ;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city,String state,String country,String contactno,String pincode) 
	{
		this.city     = city     ;
		this.state    = state    ;
        this.country  = country  ;
		this.contactno= contactno;
		this.pincode  = pincode  ;
	}
	public void disp() 
	{
		System.out.println(city + " " + state + " " + country + " " + contactno + " " + pincode);
	}
}
