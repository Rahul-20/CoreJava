package sample.matrices;

public class MultiMat
{
	public static void main(String[] args) 
	{
		int a[][]={{1,1},{1,1}};
		int b[][]={{1,1},{1,1}};
		int multi[][]=new int[2][2];

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				for(int k=0;k<=b.length-1;k++)
				{
					multi[i][j]=multi[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int l=0;l<=multi.length-1;l++)
		{
			for(int m=0;m<=multi.length-1;m++)
			System.out.println(multi[l][m]);
		}
	}
}
