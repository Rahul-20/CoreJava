package sample.sort;

import java.util.Arrays;

/*1.Increment p until p pointed value is greater then pivot. 
 *2.Decrement q until q pointed value is less then pivot.  
 *3.if(q>p) swap q pointed value with p value.
 *4. Repeat 1,2,3 until q>=p.
 *5.if(q<p) swap q pointed value with pivote. 
 */

public class QuickSort 
{
	public static void main(String[] args) 
	{
		int a[]={39,10,29,0};
		//int a[]={9,3,0,16,1};
		int first=0;
		int end=a.length-1;
		quicksort(a,first,end);
	}
	/*	static void quicksort(int a[],int first,int end)
	{
		if(first>=end) return;
		int i=divide(a,first,end);
		System.out.println(i);
		quicksort(a, first, i-1);
		quicksort(a, i+1,end);
		for(int k:a)
		{
			System.out.println("i am hereeeeeeee"+k);
		}
	}*/

	static int quicksort(int x[],int first,int last)
	{
		int pivot=first;
		int i=first;
		int j=last;
		int temp;

		while(i<j)
		{
			while(x[i]<=x[pivot]&&i<last)
				i++;

			while(x[j]>x[pivot])
				j--;

			if(i<j)
			{
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}

		temp=x[pivot];
		x[pivot]=x[j];
		x[j]=temp;
		/*
		while(q>=p)
		{
			if(p<=a.length-1)
			{
				while(a[p] < pivot)
				{
					System.out.println(p+"--------"+a[p]);
					p++;
					if(p>=a.length-1) break;
				}
			}
			if(q>0)
			{
				while(a[q]>pivot)
				{	
					q--;
					if(q<0) break;
				}
			}
			if(q>p)
			{
				System.out.println(q+"<---->"+p+"--------q"+a[q]);
				int temp=a[q];
				a[q]=a[p];
				a[p]=temp;
			}
		}*/
		/*		int temp=a[q];
		a[q]=pivot;
		pivot=temp;
		 */
		System.out.println(":::::::::"+j);
		return j;	
	}
}

