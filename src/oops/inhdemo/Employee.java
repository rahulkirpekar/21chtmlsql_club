package oops.inhdemo;

public class Employee extends  Person
{
	int id;
	float salary;
	public Employee(int id,String name,float salary ) 
	{
		super(name);
		System.out.println("Employee - Para Constructor");
		this.id=id;
		this.salary=salary;
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee(2,"rahul",12.122f);
		e.id=1;
		e.name="Khush";
		e.salary=123245;
		System.out.println(e.id + " " + e.name + " " + e.salary);
	}
}
