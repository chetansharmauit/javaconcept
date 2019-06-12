package classobject;


interface inexample{
	
	public static final int jk = 10;
	void show();   //Compiler read like this public abstract void show();
	
}

interface multipleinheritaceachive{
	void display();
}

public class interfaceexample implements inexample,multipleinheritaceachive
{
	public void show()
	{
		System.out.println("hello"+ jk);
	}
	
	public void display()
	{
		System.out.println("hello display");
	}
	
	public void display1()
	{
		System.out.println("hello display1");
	}
	public static void main(String[] args) {
		
		interfaceexample i = new interfaceexample(); 
				i.show();
		i.display();
		i.display1();
		
		inexample j = new interfaceexample(); 
		j.show();
		

	}

}
