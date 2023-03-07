package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// A  B  C  D
		byte b[] = name.getBytes();//  65 66 67 68

		FileOutputStream fout = null ;
		try 
		{
			fout = new FileOutputStream("testclub.txt");
			fout.write(b);
			
			System.out.println("success for wrtting");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
				try 
				{
					fout.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
		}
	}
}