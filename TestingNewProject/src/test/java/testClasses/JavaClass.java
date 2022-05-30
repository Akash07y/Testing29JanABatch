package testClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public final class JavaClass {
	
	
	public static void main(String[] args) {
		
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(58, "Velocity");
		table.put(56, "Class");
		table.put(34, "Pune");
		table.put(43, "Branch");
		
		for(Map.Entry<Integer, String> e : table.entrySet())
		{
			System.out.println("Key = " + e.getKey() + "   Value = " + e.getValue());
		}
		
		System.out.println("==========================");
		
		table.put(34, "Mumbai");
		
		for(Map.Entry<Integer, String> e : table.entrySet())
		{
			System.out.println("Key = " + e.getKey() + "   Value = " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		
//		map.put(null, "Velocity");
//		map.put(56, null);
//		map.put(34, "Pune");
//		map.put(43, null);
//		
//		for(Map.Entry<Integer, String> e : map.entrySet())
//		{
//			System.out.println("Key = " + e.getKey() + "   Value = " + e.getValue());
//		}
//		
//		System.out.println("==========================");
//		
//		map.put(34, "Mumbai");
//		
//		for(Map.Entry<Integer, String> e : map.entrySet())
//		{
//			System.out.println("Key = " + e.getKey() + "   Value = " + e.getValue());
//		}
		
		
		
//		HashSet<Character> set = new HashSet<Character>();
//		
//		set.add('A');
//		set.add('@');
//		set.add('$');
//		set.add('&');
//		
//		//advance for loop
//		for(char t : set)
//		{
//			System.out.println(t);
//		}
		
		
		
		
		
		
		// Homogenius  collection
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		
//		a.add(15);
//		a.add(89);
//		a.add(52);
//		a.add(62);
//		
//		for(int i = 0 ; i < a.size() ; i++)
//		{
//			System.out.println( a.get(i) );
//		}
//		
//		a.remove(2);
		
	}

}
