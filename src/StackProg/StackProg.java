package StackProg;

public class StackProg
{
	int top;
	public static int st[]=new int[10];
	public StackProg() 
	{
		top=-1;
	}

	boolean isEmpty()
	{
		return (top < 0);
	}

	public static void main(String args[])
	{
		StackProg stProg=new StackProg();
		stProg.push(1);
		stProg.push(2);
		stProg.push(3);
		stProg.push(4);
		stProg.push(5);
		stProg.printArr(st);
		
		stProg.pop();
		stProg.pop();
		stProg.pop();
		stProg.pop();
		stProg.printArr(st);
	}	
	public void push(int val)
	{
		if(top>=st.length)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			st[++top]=val;
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		int poped=st[top--];
		System.out.println("Popped:::::"+poped);
		return poped;
	}
	public void printArr(int[] a)
	{
		for(int i=0;i<top+1;i++)
		{
			System.out.println("Stack Values are:"+a[i]);
		}
	}
}
