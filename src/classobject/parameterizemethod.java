package classobject;

public class parameterizemethod {
	
	public void methodname(int a, int b)
	{
	
		System.out.println("hello");
		System.out.println(a+" "+b);
	}
	

	public static void main(String[] args) {
		
		//one class using in another class
		leanmethod lean = new leanmethod();
		lean.a = 10;
		lean.name = "test";
		lean.methodname();
		
		parameterizemethod pem = new parameterizemethod();
		pem.methodname(10,10);
		

	}

}
