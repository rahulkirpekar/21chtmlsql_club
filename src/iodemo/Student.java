package iodemo;

import java.io.Serializable;

public class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rno;
	private String name;
	private int std;
	public Student() {
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
}
