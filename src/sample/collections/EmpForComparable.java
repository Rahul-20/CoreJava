package sample.collections;

public class EmpForComparable implements Comparable
{
	int empNo;
	String empName;

	EmpForComparable(int empNo,String s1)
	{
		this.empNo=empNo;
		this.empName=s1;
	}

	public int compareTo(Object o)
	{
		EmpForComparable e=(EmpForComparable)o;
		if(e.empNo==empNo)
			return 0;
		else if(e.empNo>empNo)
			return 1;
		else 		
			return -1;	
	}
}
