package day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GetValues {
	public static void getValues(HashMap<String,Integer> hm) {
		Collection<Integer> values=hm.values();
		List l=new ArrayList(values);
		Collections.sort(l);
		Iterator i= l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Dec", 12);
		hm.put("Ape", 4);
		hm.put("Cat", 1);
		hm.put("Dog", 16);
		hm.put("Java", 8);
		hm.put("C", 10);
		getValues(hm);

	}

}
