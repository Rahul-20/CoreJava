package sample.arrays;

import java.util.Scanner;

public class Sampleeee 
{
	public static void main(String[] args) {
		char ch[]=new char[10];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10;i++)
		{
			ch[i]=s.next().charAt(0);
		}
		
		for(int i=0; i<10;i++)
		{
			System.out.println(ch[i]);
		}
		
	}
}
