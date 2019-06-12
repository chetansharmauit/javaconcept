package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
	
	public static void main(String[] args) 
	{
		List<String> lt1 = new ArrayList<String>();		
		lt1.add("abc");
		lt1.add("ade");
		lt1.add("abc");
		
		System.out.println(lt1);
		
		System.out.println(lt1.size());
		
		/*
		 * String value1 = lt1.get(0); 
		 * String value2 = lt1.get(1);
		 * String value3 =lt1.get(2); 
		 * System.out.println(value1); System.out.println(value2);
		 * System.out.println(value3);
		 */
		
		for(int i=0;i<lt1.size();i++)
		{
			System.out.println(lt1.get(i));
		}
	}

}
