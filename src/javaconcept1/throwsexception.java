package javaconcept1;

public class throwsexception {

	public static void main(String[] args) {
		throwsexception obj = new throwsexception();
		obj.abc();
		System.out.println("abc");
	}

	public void abc() 
	{
		try {
			d();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void d() throws Exception
	{
		int i=1/0;
	}
	
}
