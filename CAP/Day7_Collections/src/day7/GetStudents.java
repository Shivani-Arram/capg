package day7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GetStudents {
	public HashMap<Integer,String> getstudents(HashMap <Integer,Integer> hm ){
		HashMap<Integer,String> h=new HashMap<>();
		Set<Integer> set = hm.keySet();
        for(Integer s:set)
        {
               Integer marks = hm.get(s);
               if(marks>=90)
               {
                     h.put(s,"Gold");
               }
               else if(marks >=80)
               {
                     h.put(s,"Silver");
               }
               else if(marks>=70)
               {
                     h.put(s,"Bronze");
               }
        }
		return h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			hm.put(a, b);
		}
		GetStudents gs=new GetStudents();
        System.out.println(gs.getstudents(hm));
	}

}
