package day8;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import java.util.Iterator;
public class Linked_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("C", 1);
		hm.put("C++", 2);
		hm.put("Java", 3);
		hm.put("Python", 4);
		hm.put("Oracle", 5);
		hm.put("DBMS", 6);
		System.out.println(hm);
		
		LinkedHashMap<String,Integer> lm=new LinkedHashMap<>();
		lm.put("C", 1);
		lm.put("C++", 2);
		lm.put("Java", 3);
		lm.put("Python", 4);
		lm.put("Oracle", 5);
		lm.put("DBMS", 6);
		System.out.println(lm);

		Iterator<Entry<String,Integer>> itr= hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,Integer> et=itr.next();
			System.out.println("Key:"+et.getKey()+"  "+"Value:"+et.getValue());
		}
	}

}
