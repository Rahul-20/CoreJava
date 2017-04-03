package sample.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


//Both are interfaces.

//ListIerator can traverse both directions.
//ListIterator traverse only on list.
//ListIterator can add remove the elements.
//ListIterator can iterate from any index.

//Iterator can traverse both directions.
//Iterator can only remove the elements.
//Iterator traverse only on list,set,map.
//Iterator is fail fast....which means if you have used Collection like ArrayList then you know that when you iterate over them,
//no other thread should modify the collection e.g adding or removing a new element then it throws ConcurrentModificationException,  this is known as fail-fast behavior 



public class ListIterAndIter 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("Rahul");
		l.add("Kumar");
		l.add("Pamidi");
	
		Iterator<String> it=l.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		
		}
		
		ListIterator<String> li=l.listIterator(1);
		
		while (li.hasNext()) 
		{
			System.out.println(li.next());
		}
	}
}
