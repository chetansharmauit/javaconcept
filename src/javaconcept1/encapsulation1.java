package javaconcept1;

import java.io.ObjectInputStream.GetField;

class e1
{
	private int emp_id;    // Data hiding
	 
	public void setid(int empid)
	{
		emp_id = empid;
	}
	
	public int getid()
	{
		return(emp_id);
	}
}   //encapsulation

public class encapsulation1 {
	
	public static void main(String[] args) 
	{
		e1 e = new e1();
		e.setid(123);
		System.out.println(e.getid());

	}

}