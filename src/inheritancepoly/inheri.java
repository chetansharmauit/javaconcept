package inheritancepoly;


class Abc
{
	public void start()
	{
		System.out.println("start call");
		
	}
}

public class inheri extends Abc {

	public void start1()
	{
		System.out.println("start call");
		
	}
	public static void main(String[] args) {
		inheri in = (inheri) new Abc();
		in.start();
		Abc a1 = new Abc();
	//	a1.start1();
		Abc a2 = new inheri();
		a2.start();
	//	a2.start1();
		

	}

}
