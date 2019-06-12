package collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("ade");
		hs.add("abd");
		hs.add("abc");
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		for(String value : hs)
		{
			System.out.println(value);
		}
		
		Iterator<String> it11 = hs.iterator();
		String val1 = it11.next();
		String val2 = it11.next();
		String val3 = it11.next();
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		
		Set<String> hs1 = new LinkedHashSet<String>();
		hs1.add("abc");
		hs1.add("ade");
		hs1.add("abd");
		hs1.add("abc");
		System.out.println("hash map start");
		System.out.println(hs1.size());
		Iterator<String> itr = hs1.iterator();
		String value1 = itr.next();
		String value2 = itr.next();
		String value3 = itr.next();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("hash map start");
		for(String v : hs1 )
		{
			System.out.println(v);
		}
		
		
	}

}
