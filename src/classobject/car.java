package classobject;

class car extends abstractclassexample {
	 
	 void start()
	{
		System.out.println("car is ready");
	}
	
	  public static void main(String[] args) 
		 {
			 car c = new car();
			 c.start();
			 
			 bike b = new bike();
			 b.start();
			 
		 }
}