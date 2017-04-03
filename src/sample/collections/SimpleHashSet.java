package sample.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleHashSet 
{
	public static void main(String[] args) 
	{
		//Set will not allow duplicants
		//Set internally uses HashMap
		//Set does not maintain insertion order
		
		
		Set<String> s=new HashSet<String>();
		s.add("abc");
		s.add("ggsb");
		s.add("Rahul");
		s.add("Kumar");
		s.add("Pamidi");
		s.add("Rahul");
		s.add("Kumar");
		s.add("Pamidi");
		
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
