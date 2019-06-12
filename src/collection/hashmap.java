package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
	

		public static void main(String[] args) 
		{
		int a[] ;
		a = new int[10];
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<10;i++)
			{
			a[i] = s.nextInt();
			
			}	
//		for(int i=0;i<10;i++)
//		{
//		System.out.println(a[i]);
		
//		}	
		
		Map<Integer, Integer> b = new HashMap<>();
		
		//webdriver driver = new firefox driver();
		//driver.get("url");
		
		for(int i=0;i<10;i++)
		{
		int x = a[i];
		if(b.containsKey(x) )
		  {
			int j = i+1;
			System.out.println(a[i] + "is duplicate on" + j +"position");
		  
		  }
		else
		  {
			b.put(x, 1);
		  }
		
		}	}
	}
