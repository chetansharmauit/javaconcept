package classobject;

public class leanmethod {

	public int a; public String name;
	
	public void methodname()
	{
	
		System.out.println("hello reach in method");
		System.out.println(a+name);
	}
	
	
	public static void main(String[] args) {
		
		leanmethod lean = new leanmethod();
		lean.a = 10;
		lean.name = "test";
		lean.methodname();

	}

}
