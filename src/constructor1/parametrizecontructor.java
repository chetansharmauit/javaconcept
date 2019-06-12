package constructor1;

public class parametrizecontructor {
	
	String name; int id;
	 parametrizecontructor(String name,int id) 
	 {
		this.name = name;
		this.id=id;
	 }

public static void main(String[] args) {
		parametrizecontructor p1 = new parametrizecontructor("chetan",101);
		parametrizecontructor p2 = new parametrizecontructor("chetan1",102);
		
		System.out.println("emp "+p1.name+" "+p1.id);
		p1.name = "sharma"; p1.id = 111;
		System.out.println("emp "+p1.name+" "+p1.id);
		System.out.println("emp "+p2.name+" "+p2.id);
	}
}
