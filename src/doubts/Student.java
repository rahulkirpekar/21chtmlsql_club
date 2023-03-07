package doubts;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public Student() 
	{
		rno=1;
		name="rahul";
		std=12;
	}
	public Student(int rno,String name , int std) 
	{
		this.rno=rno;
		this.name=name;
		this.std=std;
	}
	public Student(Student s) 
	{
		this.rno=s.rno;
		this.name=s.name;
		this.std=s.std;
	}
	
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std + " " + this);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student(2,"Krunal",12);
		Student s3 = new Student(s2);

		s1.disp();
		s2.disp();
		s3.disp();
		
		s2.rno=5;
		s2.disp();
		s3.disp();
		
		
	}
}
