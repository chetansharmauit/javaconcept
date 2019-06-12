package javaconcept1;

public class throwclass {

	public static void main(String[] args) {
		
		int i = 10;
		
		try {
			throw new Exception ("my exception");
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
		
			
		
		
		System.out.println("abc");
		
	}

}
