package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/**
 * @author erapami
 *
 * http://javarevisited.blogspot.in/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * http://javarevisited.blogspot.in/2015/06/top-20-array-interview-questions-and-answers.html
 */
public class StringPrograms 
{
	public static void main(String[] args) 
	{
		String rev=reverseString();
		System.out.println(rev);

		String removeDup=removeDuplicates();
		System.out.println(removeDup);

		String findDup=findDuplicateChar();
		System.out.println(findDup);

		String manSort=manSort("dcba");
		System.out.println(manSort);

		String anagramProg=(anagramsProg()==true)?"Anagram":"Not Anagram";
		System.out.println(anagramProg);

		char res=firstUniqueChar();
		System.out.println(res);

		String checkDigFlag=(containsOnlyDigits()==true)?"Contains Digits":"Doesn't contain digits";
		System.out.println(checkDigFlag);

		Map<Character, Integer> findDupAndCount=findDupAndCount();
		System.out.println("===================START===============================");
		for (Map.Entry<Character, Integer> entry : findDupAndCount.entrySet())
		{
			System.out.println(entry.getKey() + "------->" + entry.getValue());
		}
		System.out.println("===================END===============================");
		
		
		Map<Character, Integer> findGivenOccChar=findGivenOccChar();
		System.out.println("===================START===============================");
		for (Map.Entry<Character, Integer> entry : findGivenOccChar.entrySet())
		{
			System.out.println(entry.getKey() + "------->" + entry.getValue());
		}
		System.out.println("===================END===============================");
		
		int convertStringToInt=convertStringToInt();
		System.out.println(convertStringToInt);
		
		String replaceSpace=replaceSpace();
		System.out.println(replaceSpace);
		
		String replaceSpaceInCharArr =replaceSpaceInCharArr();
		System.out.println(replaceSpaceInCharArr);
		
	}

	//How to find duplicate characters and their count in a String?
	public static Map findDupAndCount()
	{
		String input="eaabbaacd";
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		String res="";
		for(int i=0;i<input.length();i++)
		{
			if(mp.containsKey(input.charAt(i)))
			{
				int ct=(int) mp.get(input.charAt(i));
				mp.put(input.charAt(i), ct+1);
			}
			else
			{
				mp.put(input.charAt(i), 1);
			}
		}
		return mp;
	}

	//How to count number of vowels and consonants in a String?

	//How to count occurrence of a given character in String?
	public static Map findGivenOccChar()
	{
		String input="eaabbaacd";
		char findOcc='a';
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++)
		{
			if(mp.containsKey(input.charAt(i)) && input.charAt(i)==findOcc)
			{
				int ct=(int) mp.get(input.charAt(i));
				mp.put(input.charAt(i), ct+1);
			}
			else if(input.charAt(i)==findOcc)
			{
				mp.put(input.charAt(i), 1);
			}
		}
		return mp;
	}


	//How to convert numeric String to an int?
	public static int convertStringToInt()
	{
		String input="123";
		int sum=0;
		int zeroAscii=(int)'0';
		for(int i=0;i<input.length();i++)
		{
			int tempAscii=input.charAt(i);
			sum=(sum*10)+(tempAscii-zeroAscii);
		}
		return sum;
	}

	//How to replace each given String to other e.g. blank with %20?
	public static String replaceSpace()
	{
		String input="Rahul Kumar";
		String res="";
		for(int i=0;i<input.length();i++)
	    {
	        if(input.charAt(i)==' ')
	        	res=res+"%20";
	        else
	        	res=res+input.charAt(i);
	    }
		return res;
	}
	
	
	//How to replace each given Character to other e.g. blank with %20?
	public static String replaceSpaceInCharArr()
	{
		 char[] arr = {'a',' ',' ',' ','b'};
		 
		 //find the number of spaces
		 int spaceCounter=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==' ')
			 {
				 spaceCounter++;
			 }
		 }
		 int newLen=arr.length+2*spaceCounter;
		 int newArrayPosition = 0;
		 char[] res=new char[newLen+1];
		 res[newLen] = '\0';
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==' ')
			 {
				res[newArrayPosition]='%';
				res[newArrayPosition+1]='2';
				res[newArrayPosition+2]='0';
				newArrayPosition=newArrayPosition+3;
			 }
			 else
			 {
				res[newArrayPosition]=arr[i];
				newArrayPosition++;
			 }
		 }
		 String s=new String(res);
		 return s;
	}
	

	//How to find all permutations of String?

	//How to reverse words in a sentence without using library method?

	//How to check if String is Palindrome?

	//How to check if a String is valid shuffle of two String

	//Write a program to check if a String contains another String e.g. indexOf()

	//How  to return highest occurred character in a String

	//Write a program to remove a given characters from String

	//Write a program to find longest palindrome in a string


	//How to check if a String contains only digits?
	public static boolean containsOnlyDigits()
	{
		String name="Rahul123";
		Pattern p=Pattern.compile(".*[^0-9].*"); //or Pattern pattern = Pattern.compile(".*\\D.*");
		try
		{
			Long.parseLong(name);
		}catch(Exception e)
		{
			return true;
		}
		return p.matcher(name).matches();		
	}


	//How to program to print first unique character from String?
	public static char firstUniqueChar()
	{
		String name="RRahul";
		int arr[]=new int[name.length()];

		/*	int loopBreakCounter=0;
		char ch = 0;
		int pos;
		//Output should be 'a'
		loopBreakCounter=1;
		ch=name.charAt(i);
		break;
		boolean b[]=new boolean[256];
		for(int i=0;i<name.length();i++)
		{
			if(b[name.charAt(i)]==false)
			{

			}

		}*/
		return 0;
	}



	public static String manSort(String name)
	{
		char arrChar[]=name.toCharArray();
		for(int i=0;i<arrChar.length;i++)
		{
			for(int j=0;j<arrChar.length;j++)
			{
				char temp;
				//System.out.println("Array arrChar[i]"+" "+" "+arrChar[i]+" "+" "+"Array arrChar[j]"+arrChar[j]);
				if(arrChar[j]>arrChar[i])
				{
					temp=arrChar[i];
					arrChar[i]=arrChar[j];
					arrChar[j]=temp;
				}
			}
		}
		String res=new String(arrChar);
		return res;
	}


	//How to check if two Strings are anagrams of each other?
	public static boolean anagramsProg()
	{
		String s1="army";
		String s2="mary";
		if(manSort(s1).equals(manSort(s2)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	// How to Print duplicate characters from String?
	public static String findDuplicateChar()
	{
		String name="Raahull";
		String res="";
		boolean arr[]=new boolean[256];
		for(int i=0;i<=name.length()-1;i++)
		{
			if(arr[name.charAt(i)]==false)
			{
				arr[name.charAt(i)]=true;
			}
			else
			{
				res=res+name.charAt(i);
			}
		}
		return res;
	}

	public static String reverseString()
	{
		String name="Rahul Kumar Pamidi";
		String res="";
		for(int i=name.length()-1;i>=0;i--)
		{
			res=res+name.charAt(i);
		}	
		return res;
	}

	public static String removeDuplicates()
	{
		String name="Rahul Kumar Pamidi";
		String res="";
		boolean[] arr=new boolean[256];
		for(int i=0;i<=name.length()-1;i++)
		{
			if(arr[name.charAt(i)]==false)
			{
				res=res+name.charAt(i);
				arr[name.charAt(i)]=true;
			}
		}
		return res;
	}


}


