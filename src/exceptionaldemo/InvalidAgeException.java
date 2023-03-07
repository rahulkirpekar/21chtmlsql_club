package exceptionaldemo;

public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String name) 
	{
		super(name);
	}
}
