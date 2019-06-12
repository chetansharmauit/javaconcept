package javaconcept1;

public class trycatch {

	public static void main(String[] args) {
		int i;
		
		try {
		i = 10/0;
		System.out.println(i);
		 }
		 
		catch (Exception e) {				//or write catch (Throwable e)
			e.printStackTrace();
		}
		System.out.println("abe");	

	}

}
