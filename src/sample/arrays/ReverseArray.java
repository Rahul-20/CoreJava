package sample.arrays;

import java.util.Arrays;
import java.util.List;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Integer a[]={10,20,30,20};
		Integer b[]=new Integer[a.length];
		
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			System.out.println(i+""+j);
			b[j]=a[i];
		}
		List<Integer> aa=Arrays.asList(b);
		System.out.println(aa);
	}
}
