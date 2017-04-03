package sample.matrices;

import java.util.Arrays;

public class AddMat 
{
	public static void main(String[] args) 
	{
		int [][] a={{1,1,1},{1,1,1},{1,1,1}};
		int [][] b={{1,1,1},{1,1,1},{1,1,1}};
		int sum[][]=new int[3][3];

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				//System.out.println(i+","+j+"---->"+a[i][j]);
				//				/System.out.println(b[i][j]);
				sum[i][j]=a[i][j]+b[i][j];
			}
		}

		for(int i=0;i<=sum.length-1;i++)
		{
			for(int j=0;j<=sum.length-1;j++)
			{
				System.out.println(i+","+j+"---->"+sum[i][j]);
//				/System.out.println(Arrays.asList(sum[i][j]));
			}
		}
	}
}
