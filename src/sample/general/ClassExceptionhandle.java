package sample.general;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassExceptionhandle 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
	{
		/*try
		{
			Integer.parseInt("111");
		}
		catch(Exception e)
		{
			try
			{
				Integer.parseInt("4444");
			}
			catch(Exception e1)
			{
				System.out.println(e);
				System.out.println(e1);
			}
		}*/
	
		
		System.out.println(args[0]);
		Object  o=	Class.forName(args[0]).newInstance();
	    Method m = o.getClass().getMethod("fun", new Class[] {});
	    m.invoke(o, args);
	    System.out.println(m);
		System.out.println("This Class Object  got created"+o.getClass().getName());
		
	}
}


class Student
{
	void fun()
	{
		System.out.println("I am in Student");
	}
}
class Customer
{
	void fun()
	{
		System.out.println("I am in Customer");
	}	
}
