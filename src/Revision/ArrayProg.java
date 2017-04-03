package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProg 
{
	public static void main(String[] args) 
	{
		findMissingNumber();
		findMultipleMissingNum();
		findDup();
		removeDup();
		findAllPairs();
		findInterSectionOfArrays();
		findOutFirstRepeatingElement();
		MinAndMax();
		findSmallIntForSubset();
		arrangePostiveAndNeg();
	}

	//How to find multiple missing number in integer array of 1 to 5?
	public static void findMultipleMissingNum()
	{
		int n=5;
		int a[]={1,3,5};
		byte[] b=new byte[6];
		for(int i=0;i<a.length;i++)
		{
			b[a[i]]=1;
		}
		for(int j=0;j<b.length;j++)
		{
			//without j!=0 condition it will print 0,2,4,but we need 2,4;
			if(b[j]==0 && j!=0)
				System.out.println("Missing Elements:::::::"+j);
		}
	}


	//How to find the missing number in integer array of 1 to 5?
	public static void findMissingNumber()
	{
		int n=5;
		int a[]={2,3,4,5};
		int missingNum=0;
		int totalSum=0;
		int givenArrSum=0;
		for(int i=0;i<a.length;i++)
		{
			totalSum=n*(n+1)/2;
		}
		for(int i=0;i<a.length;i++)
		{
			givenArrSum=givenArrSum+a[i];
		}
		missingNum=totalSum-givenArrSum;
		System.out.println("Missing Number::::::"+missingNum);
	}

	//How to find duplicate number on Integer array in Java?
	//Another way is sort and compare i and i++ but complexity for sort is NlogN
	public static void findDup()
	{
		int a[]={4,5,1,1,2,3,5,3};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		byte b[]=new byte[max+1];
		for(int i=0;i<a.length;i++)
		{
			if(b[a[i]]==0)
			{
				b[a[i]]=1;
			}
			else
			{
				System.out.println("Duplicate:::::"+a[i]);
			}
		}
	}

	public static void removeDup()
	{
		int a[]={1,2,2,3,3,4,5};
		List<Integer> l=new ArrayList<Integer>();
		byte b[]=new byte[6];
		for(int i=0;i<a.length;i++)		
		{
			if(b[a[i]]==0)
			{
				l.add(a[i]);
				b[a[i]]=1;
			}
		}
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Unique Ele in Array::::"+l.get(i));
		}
	}

	//How to find all Pairs in Array of Integers whose Sum is equal to a given Number
	public static void findAllPairs()
	{
		int a[]={1,2,3};
		int givenVal=3;
		byte b[]=new byte[4];
		for(int i=0;i<a.length;i++)
		{
			int temp=givenVal-a[i];
			if(b[temp]==1)
			{
				System.out.println("a[i]::::"+a[i]+"Temp:::"+temp+"sum::"+givenVal);
			}
			b[a[i]]=1;
		}
	}

	//Find common elements in three sorted arrays
	public static void findInterSectionOfArrays()
	{
		int ar1[] = {0,1,2,3};
		int ar2[] = {3,2,1};
		int ar3[] = {2,3,1};
		int len=ar1.length+ar2.length+ar3.length;
		int res[]=new int[len];
		for(int i=0;i<ar1.length;i++)
		{
			int bucketNum=hashToBucket(len,ar1[i]);
			res[bucketNum]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			int bucketNum=hashToBucket(len,ar2[i]);
			if(res[bucketNum]==ar2[i])
			{
			}
			else
			{
				res[bucketNum]=ar2[i];
			}
		}
		for(int i=0;i<ar3.length;i++)
		{
			int bucketNum=hashToBucket(len,ar3[i]);
			if(res[bucketNum]==ar3[i])
			{
			}
			else
			{
				res[bucketNum]=ar2[i];
			}
		}
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
			{
				System.out.println("Reapeated:::::"+res[i]);
			}
		}
	}
	static int hashToBucket(int tableSize, int hash) {
		return hash%tableSize;
	}

	//How find the first repeating element in an array of integers?
	public static void findOutFirstRepeatingElement()
	{
		int a[]={1,2,2,4,5,7,7};
		byte b[]=new byte[8];
		for(int i=0;i<a.length;i++)
		{
			if(b[a[i]]==0)
			{
				b[a[i]]=1;
			}
			else
			{
				System.out.println("First Repeated Ele:::::"+a[i]);
				break;
			}
		}
	}

	//How to find top two numbers from an integer array?
	public static void MinAndMax()
	{
		int []a={-4,1,3,1,19,20,10000};

		//let us assume the both min and max at position 0;
		int min=a[0];
		int max=a[0];

		//Now start comparing and i with max and min default values, to check i value is greater than max or less than min value.
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]< min)
			{
				min=a[i];
			}
		}
		System.out.println("Mini value::::::"+ min);
		System.out.println("Max value::::::"+max);
	}

	//How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? 
	public static void findSmallIntForSubset()
	{
		int res = 1; // Initialize result
		int a[]={1, 3, 6, 10, 11, 15};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=res)
			{
				res=res+a[i];
			}
		}
		System.out.println("Smallest Positive Integer:::"+res);
	}

	//How to arrange array in alternating positive and negative number?
	public static void arrangePostiveAndNeg()
	{
		int arr[]={1,3,-9,-5,0,-1};
		int i = -1, temp = 0;
		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j] < 0)
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int pos = i+1, neg = 0;
		for (int j = 0; j < arr.length; j++)
		{
			if(j%2==0)
			{
				if(arr[j]<0)
				{
					temp = arr[neg];
					arr[neg] = arr[pos];
					arr[pos] = temp;
					pos++;
					neg += 2;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}

	}

	//How to find if there is a sub array with sum equal to zero? 

	//We can also use hashing. The idea is to iterate through the array and for every element arr[i], calculate sum of elements form 0 to i (this can simply be done as sum += arr[i]). If the current sum has been seen before, then there is a zero sum array. Hashing is used to store the sum values, so that we can quickly store sum and find out whether the current sum is seen before or not.

	//How to remove duplicates from array in place?

	//How to remove a given element from array in Java?

	//How to merge sorted array? 

	//How to find sub array with maximum sum in an array of positive and negative number?

	//How to find sub array with largest product in array of both positive and negative number?

	//Write a program to find length of longest consecutive sequence in array of integers?

	//How to find minimum value in a rotated sorted array?

	//Given an array of of size n and a number k, find all elements that appear more than n/k times

	//Difference between array and linked list data structure?

	//How to check if array contains a duplicate number?

}
