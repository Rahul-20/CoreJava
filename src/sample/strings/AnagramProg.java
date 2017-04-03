package sample.strings;

import java.util.Arrays;

public class AnagramProg 
{
	public static void main(String[] args) 
	{
		String s="CPU";
		char[] c=s.toCharArray();
		String s1="CUP";
		char[] c1=s1.toCharArray();
		System.out.println(s);
		System.out.println(s1);
		Arrays.sort(s.toCharArray());
		Arrays.sort(s1.toCharArray());
		System.out.println();
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("Anangaram");   
		}
	}
}
