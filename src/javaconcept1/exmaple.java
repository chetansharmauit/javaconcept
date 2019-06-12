//one class using in another package 

package javaconcept1;
import classobject.*;
import classobject.leanmethod;

public class exmaple {
	
	public void methodname()
	{
	
		System.out.println("hello reach in method");
	//	System.out.println(a+name);
	}

public static void main(String[] args) {
		
		leanmethod lean = new leanmethod();
		lean.a = 10;
		lean.name = "test";
		lean.methodname();
}
}
