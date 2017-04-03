package sample.strings;

import java.util.HashMap;
import java.util.Map;

public class UniqueCount 
{
	public static void main(String[] args) 
	{
		String s="rahulkumarpamidi";
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		boolean b[]=new boolean[256];
		for(int i=0;i<s.length();i++)
		{
			if(b[s.charAt(i)]==false)
			{
				h.put(s.charAt(i), 1);
				b[s.charAt(i)]=true;
			}
			else if(b[s.charAt(i)]==true)
			{
				int j=h.get(s.charAt(i));
				h.put(s.charAt(i), j+1);
			}
		}
		for(Map.Entry<Character, Integer> e:h.entrySet())
		{
			System.out.println(e.getValue()+""+e.getKey());
		}
	}
}
