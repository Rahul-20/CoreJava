package sample.strings;

import java.util.*;

//Given a list of words and list of alphabets, implement the method below which will print all the words having all the alphabets.

public class WordAndChar 
{
	public static void main(String[] args) 
	{
		char c[]={'a','u'};
		List<String> l=new ArrayList<String>();
		l.add("appleu");
		l.add("Rahul");
		l.add("Kumar");
		for(String a:l)
		{
			int counter=0;
			for(int i=0;i<c.length;i++)
			{
				char ch=c[i];
				if(a.indexOf(ch)==-1)
				{
					counter++;
				}
			}
			if(counter==0)
			{
				System.out.println("Words::"+a);
			}
		}
	}	
}