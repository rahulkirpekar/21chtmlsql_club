package iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestApp4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder(); 
		FileReader fr = null;
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\21chtmlsql_club\\src\\iodemo\\TestApp4.java");

			int temp;
			while(	(temp = fr.read())	!= -1) 
			{
				sb.append((char)temp);
			}
			System.out.println("success");
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
				fr.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("==> " + sb);
	}
}
