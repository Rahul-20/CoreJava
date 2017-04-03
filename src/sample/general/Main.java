package sample.general;

public class Main implements Func 
{

	@Override
	public void myCall() {
	
		System.out.println("I am in myCall()");
		
	}
	
	public static void main(String[] args) {
		Func f1=new Main();
		
		System.out.println(f1.a);
	}
	

}
