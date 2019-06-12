package classobject;

public class staticexampe {

	static int i =10;
	int j =20;
	
	public static void display()
	{
		staticexampe jk = new staticexampe();
		System.out.println("first"+i+jk.j);
		
	}
	
	/*
	 * public static void main(String[] args) { //staticexampe s = new
	 * staticexampe(); display();
	 * 
	 * }
	 */
		
}

class set1 extends staticexampe {

	public static void main(String[] args) {
		display();

	}

}
