package sample.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sampleList 
{
	public static void main(String[] args) 
	{
		//List Maintains Insertion Order.
		//Default size of List is 10.
		//List allows duplicants.
		List<String> al=new ArrayList<String>();
		al.add("abc");
		al.add("Rahul");
		al.add("def");
		al.add("Kumar");
		al.add("Rahul");
		al.add("Kumar");
		al.add("xyz");
		Iterator i=al.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
