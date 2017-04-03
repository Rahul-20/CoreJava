package sample.inheritance;

class Abc
{
	void func()
	{
		System.out.println("I am in Abc");
	}
}

public class Inher1 extends Abc 
{
	void func()
	{
		System.out.println("I am in Inher1");
	}
	public static void main(String[] args) 
	{
		//Abc h1=new Abc();
		Abc h1=new Inher1();
		//Inher1 h1=new Abc(); //compile time error
		h1.func();
	}
}


