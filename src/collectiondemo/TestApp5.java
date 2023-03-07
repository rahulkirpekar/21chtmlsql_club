package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("CANADA");
		list.add("Pakistan");
		list.add("UK");
		
		System.out.println("list-  " + list);
		
		// Collections(C) / Collection(I)
		
		Collections.sort(list);// primitive / string
		
		System.out.println("After list-  " + list);
		
	}
}
