package sample.strings;

public class SpiltWithoutUsingPred 
{
	public static void main(String[] args) 
	{
		String s="Rahul,Kumar,Pamidi";
		String tok="";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==',')
			{
				flag=false;
			}
			else 
			{
				tok=tok+s.charAt(i);
				flag=true;
			}
			if(flag==false || i==s.length()-1)
			{
				System.out.println(tok);
				tok="";
			}
		}
	}
}
