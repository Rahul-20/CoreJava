package sample.general;

public class Base 
{
	public static void main(String[] args) 
	{
		Notifier b=new Notifier();
		b.myFlatMap(new Func() {
			
			@Override
			public void myCall() {
			System.out.println("inside main method");
				
			}
		});	
	}
}
