package sample.general;

public class primenum 
{
	public static void main(String[] args) 
	{
		//int a=10;	
		fun(20);

	}

	static void fun(int a)
	{
		for(int i=2;i<=a;i++)
		{
			int p =1;
			for(int j=2 ; j<=i/2; j++)
			{
				if(i%j==0)
				{
					p=0;
				}	
			}
			if(p==1)
			{
				System.out.println(i);
			}
		}
	}
}
