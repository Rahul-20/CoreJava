package sample.specifiers.def;

import sample.specifiers.Def1;

public class DefaultAccess extends Def1
{
	public static void main(String[] args) 
	{
		DefaultAccess a=new DefaultAccess();
		System.out.println(a.a);
		System.out.println(a);
	}
	public void msg()
	{
		
	}
}
