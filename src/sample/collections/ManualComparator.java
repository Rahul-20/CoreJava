package sample.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ManualComparator 
{
	public static void main(String[] args) 
	{
		/*ArrayList<String> al=new ArrayList<String>();  
		al.add("apple");  
		al.add("Rahul");  
		al.add("Kumar");  
		al.add("Pamidi");  
		al.add("AA");
		Collections.sort(al);  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  */

		ArrayList<EmpForComparable> al=new ArrayList<EmpForComparable>();  
		al.add(new EmpForComparable(110,"Rahul"));  
		al.add(new EmpForComparable(106,"Kumar"));  
		al.add(new EmpForComparable(105,"Pamidi"));  

		Collections.sort(al);  
		for(EmpForComparable st:al)
		{  
			System.out.println(st.empName+" "+st.empNo+"");  
		}  
		
		String s="abc";
		s.equals("abc");
		s.hashCode();
		s.compareTo("a");
	}
}
