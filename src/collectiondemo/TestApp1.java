package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.scan();
		
		ArrayList listObj = new ArrayList();
		listObj.add(10);// <----itr
		listObj.add(10.31224f);
		listObj.add(10.432121);
		listObj.add(true);
		listObj.add("abc");
		listObj.add('R');
		listObj.add(s);
		
		
		for(Object obj : listObj) 
		{
			if (obj instanceof Student) 
			{
				s = (Student)obj;
				s.disp();
			} else 
			{
				System.out.println(obj);
			}
		}
		
		
		
//		for (int i = 0; i < listObj.size(); i++) 
//		{
//			Object obj = listObj.get(i);
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();	
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		

//		Iterator itr = listObj.iterator();
//		while(itr.hasNext()) 
//		{
//			Object obj = itr.next();
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				s.disp();	
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
	}
}
