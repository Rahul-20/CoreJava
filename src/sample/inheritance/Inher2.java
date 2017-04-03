package sample.inheritance;

class Abc1
{
	Abc1()
	{
		System.out.println("I am in Abc");
	}
}
public class Inher2 extends Abc1
{
	Inher2()
	{
		System.out.println("I am in Cont Inher2");
	}
	public static void main(String[] args) 
	{
		Abc1 h1=new Abc1();
		//Abc1 h1=new Inher2();
		//Inher2 h1=new Inher2();
		//Inher1 h1=new Abc(); //compile time error
	}
}
