package streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		StreamApi - Collections List Objects + Arrays 
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		
		Stream streamObj = list.stream();
		
		streamObj.filter()
		
		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			if(list.get(i) <= 5) 
//			{
//				System.out.println(list.get(i));
//			}
//		}
	}
}
