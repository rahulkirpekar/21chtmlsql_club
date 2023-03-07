package stringdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		StringBuilder name= new StringBuilder("abcde");
		System.out.println(name);
		
		name.reverse();
		
		System.out.println(name);

//		System.out.println(name+"---"+name.hashCode());
//		name.append("kirpekar");
		

//		System.out.println(name+"---"+name.hashCode());
		
		
//		String name = " JAVA Langugae ";
//		System.out.println(name.trim().length());
//		char nm[] = name.toCharArray();
//		for (int i = 0; i < nm.length; i++) 
//		{
//			System.out.println(nm[i]);
//		}
		
		
		
//		name = name.replace('a', 'e');
//		System.out.println(name);
		
//		String name1 ="rahul";
//		String name2 = new String("rahul").intern();		
//		System.out.println(name1==name2);
		
//		String s1 = "";  
//		String s2 = "javatpoint"; 
//		System.out.println(s2.length());
		
//		String s3 = null;  
		    
//		System.out.println(s1.isEmpty());  
//		System.out.println(s2.isEmpty());  		
//		System.out.println(s3.isEmpty());  		
		
		
//		String s1="this is index of example";  
//		//passing substring  
//		int index1=s1.indexOf("is");//returns the index of is substring  
//		int index2=s1.indexOf("index");//returns the index of index substring  
//		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
//		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
//		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
//		int index4=s1.indexOf('s');//returns the index of s char value  
//		System.out.println(index4);//3
		
		
		
//		 String str = new String("hello javatpoint how r u");  		 
//	     char[] ch = new char[10];  	     
//	     str.getChars(6, 16, ch, 0);  	     
//	     System.out.println(ch);  
		
		
//		String name="abcdefghijklmno";  
//		byte b[] = name.getBytes();
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.println(name.charAt(i) + " " + b[i]);
//		}
		
		
//		String name="sonoo";  
//		String sf1=String.format("name is %s",name);  
//		String sf2=String.format("value is %f",32.33434);  
//		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
//		System.out.println(sf1);  
//		System.out.println(sf2);  
//		System.out.println(sf3);  
		
		
		
//		String name1="ABC";
//		String name2="abC";		
//		System.out.println(name1.equalsIgnoreCase(name2));
//		Student s = new Student();
//		System.out.println(s);
//		System.out.println(s.toString());
//		System.out.println("----------------------------------");
		
//		String name="rahul";
//		System.out.println(name);
//		System.out.println(name.getClass().getName()+"@"+Integer.toHexString(name.hashCode()));

		
		
//		String s1="java by javatpoint";  
//		System.out.println(s1.endsWith("t"));  
//		System.out.println(s1.endsWith("point"));  		
		
//		String name="what do you know about me";  
//		System.out.println(name.contains("do you know"));  		
//		System.out.println(name.contains("about"));  		
//		System.out.println(name.contains("hello"));  		
//		System.out.println("rahul"+20+10);
//		String name1="rahul";
//		String name2="kirpekar";
//		System.out.println("name1 : "+name1 + " - " + name1.hashCode());
//		System.out.println("name2 : "+name2 + " - " + name2.hashCode());

//		name1 = name1 + name2;// rahulkirpekar
		
//		String name3="rahulkirpekar";
//		System.out.println("name1 : "+name1 + " - " + name1.hashCode());
//		System.out.println("name2 : "+name2 + " - " + name2.hashCode());
//		System.out.println("name3 : "+name3 + " - " + name3.hashCode() + " -- (name1==name3)--" + (name1==name3));
		
		
	}
}
