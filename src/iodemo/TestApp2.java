package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21chtmlsql_club\\testclub.txt");

			int temp;
			
			while(	(temp = fin.read())	!= -1)
			{
				sb.append((char)temp);
			}
			
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
				fin.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("FileData : " + sb);
	}
}
