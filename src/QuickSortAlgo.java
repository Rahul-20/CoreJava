
public class QuickSortAlgo 
{
	public static void main(String[] args) {
		int a[]={10,2,3,5,1};
		sort(a,0,a.length-1);
		for(int k:a)
		{
			System.out.println(k);
		}
	}

	static void sort(int a[],int startIndex,int lastIndex)
	{
		if(startIndex<lastIndex)
		{
			int pivotIndex=part(a,startIndex,lastIndex);

			sort(a,startIndex,pivotIndex-1);
			sort(a,pivotIndex+1,lastIndex);
		}
	}

	static int part(int a[],int startIndex,int lastIndex)
	{
		int pivotVal=a[lastIndex];
		int i=startIndex-1;
		for(int j=startIndex;j<=lastIndex-1;j++)
		{
			if(a[j]<=pivotVal)
			{
				i++;
				//swap i and j
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		//swap i and pivote or high value
		int temp=a[i+1];
		a[i+1]=a[lastIndex];
		a[lastIndex]=temp;
		return i+1;
	}
}
