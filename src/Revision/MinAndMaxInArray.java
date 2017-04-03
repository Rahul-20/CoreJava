package Revision;

public class MinAndMaxInArray 
{
	public static void main(String[] args) 
	{
		MinAndMax();
		FirstAndSecondMin();
		FirstAndSecondMax();
	}

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

	public static void FirstAndSecondMin()
	{
		int a[]={1,1,5,20,10};
		int firstMin=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<firstMin)
			{
				secMin=firstMin;
				firstMin=a[i];
			}
			//to handle duplicates
			else if(a[i]<secMin && a[i]!=firstMin)
			{
				System.out.println("not enetered"+a[i]+"_____"+secMin+"___"+"____"+firstMin);
				secMin=a[i];
			}
		}
		System.out.println("First Min value::::::"+ firstMin);
		System.out.println("Sec Min value::::::"+secMin);
	}
	
	public static void FirstAndSecondMax()
	{
		int a[]={1,1,5,20,10};
		int firstMax=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>firstMax)
			{
				secMax=firstMax;
				firstMax=a[i];
			}
			//to handle duplicates
			else if(a[i]>secMax && a[i]!=firstMax)
			{
				secMax=a[i];
			}
		}
		System.out.println("First Max value::::::"+ firstMax);
		System.out.println("Sec Max value::::::"+secMax);
	}
}
