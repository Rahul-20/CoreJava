package BitWiseOperator;

public class ProgramsOnBitwise 
{
	public static void main(String[] args) 
	{
		int res=Add(10,30);
		System.out.println("Addition::"+res);
	}

	public static int Add(int x,int y)
	{
		while(y!=0)
		{
			int carryBit=x&y;
			System.out.println(carryBit);
			x=x^y;
			y=carryBit<<1;
		}
		return x;
	}
}
