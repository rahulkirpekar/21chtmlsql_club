package exceptionaldemo;

import java.io.IOException;

public class TestApp2 
{
	public static void isValidAgeForVote(int age) 
	{
		if (age < 18) 
		{
			throw new InvalidAgeException("\"Invalid Age for Vote\"");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("statement---1");
		System.out.println("statement---2");
		System.out.println("statement---3");
		System.out.println("statement---4");
		
		isValidAgeForVote(10);
		
		
		System.out.println("statement---5");
		System.out.println("statement---6");
		System.out.println("statement---7");
		System.out.println("statement---8");
	}
}
