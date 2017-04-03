import java.util.Scanner;

public class Am 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(n);
		String s1[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s1[i]=s.nextLine();
		}
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
