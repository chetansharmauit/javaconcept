package classobject;

abstract class abstractclassexample {
	
	abstract void start();
	
	public void display()
	{System.out.println("abs");
		
	}
	 public static void main(String[] args) {
			
			abstractclassexample ab = new bike();
			ab.display();	
			ab.start();
	}
}		 
class bike extends abstractclassexample{
 
	  void start()
		{
			System.out.println("bike is ready");
		} 
  }
	

 

 
  
  
 

