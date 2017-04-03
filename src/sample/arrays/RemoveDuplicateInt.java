package sample.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateInt 
{
	public static void main(String[] args) 
	{
		String s="abc";
	     int arr[]={10,10,20,30,30,30,40,40,40,40,70,70};
	     int i=1,j=0;
	     while(i<arr.length)
	     {
	    	 if(arr[i]==arr[j])
	    	 {
	    		 i++;
	    	 }
	    	 else
	    	 {
	    		 j++;
	    		 arr[j]=arr[i];
	    		 i++;
	    	 }
	     }
	     System.out.println(j);
	     Integer af[]=new Integer[j+1];
	     for(int k=0;k<af.length;k++)
	     {
	    	 af[k]=arr[k];
	    	 System.out.println(arr[k]);
	     }
	     System.out.println(Arrays.asList(af));
	}
}
