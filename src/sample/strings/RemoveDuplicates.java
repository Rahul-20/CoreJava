package sample.strings;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		String s="rahulkumarpamidi";
		String res="";
		boolean b[]=new boolean[256];
		
		for(int i=0;i<s.length();i++)
		{
		    if(b[s.charAt(i)]==false)
		    {
		    	res=res+s.charAt(i);
		    	b[s.charAt(i)]=true;
		    }
		}
		System.out.println("Finallllllllll::::::"+res);
	}
}
