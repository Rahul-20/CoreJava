package sample.general;

import java.util.Arrays;

public class FindingLCM 
{
	public static void main(String[] args) 
	{
		Integer a[]={33, 14, 7, 3};
		Arrays.sort(a);
		System.out.println(Arrays.asList(a));
		int j=2;
		for(int i=0;i<a.length;i++)
		{
			int x=a[i];
			while(a[i]%j==1)
			{
				if(a[i]%j!=1)
				{
					j++;
				}
				else
				{
					System.out.println(j);
					break;
				}
				
			}
		}
	}
}
