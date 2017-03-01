package Revision;

public class St1
{
	public static void main(String[] args) 
	{
		String s="abc";
		String s1="abc";
		String s3=s+s1;
		
		String s4="abc"+"abc";
		//s=s1=null;
		//System.out.println(s1.intern());
		//System.out.println(s.intern());
		System.out.println("abc".equals(s1.intern()));
		/*System.out.println(s);
		System.out.println(s1);
		String s3="abc";
		if(s3.equals(s))
		{
			System.out.println("Equl");
		}*/
		
	}
}
