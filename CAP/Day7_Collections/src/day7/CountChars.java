package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountChars {
    public static void countchars(char[] ch) {
    	Map<Character,Integer> m=new HashMap<Character,Integer>();
    	for(char c:ch) {
    		if(m.containsKey(c)) {
    			m.put(c,m.get(c)+1);
    		}else {
    			m.put(c, 1);
    		}
    	}
    	for(Map.Entry entry:m.entrySet()) {
    		System.out.println(entry.getKey()+"  "+ entry.getValue() );
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] c=sc.next().toCharArray();
		countchars(c);

	}

}
